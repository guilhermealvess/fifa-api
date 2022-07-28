package com.example.service.impl

import com.example.model.Confederation
import com.example.repository.ConfederationRepository
import com.example.service.ConfederationService
import jakarta.inject.Inject
import java.lang.Exception
import java.util.*
import javax.transaction.Transactional

class ConfederationServiceImpl:ConfederationService {

    @Inject
    private lateinit var confederationRepository: ConfederationRepository

    @Transactional(rollbackOn = [Exception::class])
    override fun createConfederation(confederation: Confederation) {
        confederation.id = UUID.randomUUID()
        val now = Date()
        confederation.createdAt = now
        confederation.updatedAt = now
        confederationRepository.save(confederation)
    }

    override fun search(): List<Confederation> {
        return confederationRepository.findAll()
    }

    override fun findById(id: UUID): Confederation {
        return confederationRepository.findById(id).get()
    }

    @Transactional(rollbackOn = [Exception::class])
    override fun updateConfederation(id: UUID, confederation: Confederation):Confederation {
        val conf = confederationRepository.findById(id).get()
        conf.name = confederation.name
        conf.president = confederation.president
        conf.locale = confederation.locale
        confederation.updatedAt = Date()
        confederationRepository.update(conf)
        return conf
    }

    @Transactional(rollbackOn = [Exception::class])
    override fun deleteConfederation(id: UUID) {
        confederationRepository.deleteById(id)
    }
}