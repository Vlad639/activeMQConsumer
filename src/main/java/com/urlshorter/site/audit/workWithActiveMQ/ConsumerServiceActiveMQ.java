package com.urlshorter.site.audit.workWithActiveMQ;

import com.urlshorter.site.audit.AuditMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerServiceActiveMQ {

    public static ConfigurableApplicationContext context;

    @Autowired
    AuditRecordRepository auditRecordRepository;

    @JmsListener(destination = "url-shorter-audit-q")
    public void listen(AuditMessage auditMessage)  {

        auditRecordRepository.save(
                new AuditRecord(
                        auditMessage.getLogin(),
                        auditMessage.getAction(),
                        auditMessage.getObject()
                )
        );

        System.out.println(auditMessage);

    }
}
