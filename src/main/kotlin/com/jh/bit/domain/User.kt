package com.jh.bit.domain

import com.jh.bit.domain.baseEntity.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "users")
class User(
    val name: String,
    val password: String,
    val email: String,
) : BaseEntity()
