package com.urlshorter.site.audit.workWithActiveMQ;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditRecordRepository extends JpaRepository<AuditRecord, Long> {

}
