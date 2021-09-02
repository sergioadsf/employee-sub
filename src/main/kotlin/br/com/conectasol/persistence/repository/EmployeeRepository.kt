package br.com.conectasol.persistence.repository

import br.com.conectasol.persistence.entity.Employee
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.UUID

@Repository
interface EmployeeRepository : JpaRepository<Employee, UUID>