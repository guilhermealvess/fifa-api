package com.example.service

import com.example.model.Confederation
import java.util.UUID

interface ConfederationService {
    fun createConfederation(confederation: Confederation)

    fun search(): List<Confederation>

    fun findById(id: UUID): Confederation

    fun updateConfederation(id: UUID, confederation: Confederation): Confederation

    fun deleteConfederation(id:UUID)
}