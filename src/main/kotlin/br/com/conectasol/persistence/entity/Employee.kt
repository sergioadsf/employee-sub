package br.com.conectasol.persistence.entity

import java.math.BigDecimal
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
@Table(name = "employees")
class Employee(

    @Id
    @NotNull
    val id: UUID? = null,

    @NotBlank
    @Column(nullable = false)
    var name: String,

    @NotNull
    @Column(nullable = false)
    var age: Int,

    @NotBlank
    @Column(nullable = false)
    var email: String,

    @NotNull
    @Column(nullable = false)
    var salary: BigDecimal = BigDecimal.ZERO
)