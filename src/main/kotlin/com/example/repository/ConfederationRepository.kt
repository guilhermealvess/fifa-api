package com.example.repository

import com.example.model.Confederation
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.UUID

@Repository
interface ConfederationRepository:JpaRepository<Confederation, UUID> {
}