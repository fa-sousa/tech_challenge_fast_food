package core.application.repository

import core.domain.Client

interface ClientRepository{
    fun save(client: Client) : Client
    fun findById(id: String) : Client?
}