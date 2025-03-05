package org.example.repositories

import org.example.models.Integrante

/**
 * Interfaz intermedia que especifica los tipos genericos de la interfaz [CrudRepository] para poder manejar [Long] como clave e [Integrante] como valor
 */
interface EquipoRepository<T, U> : CrudRepository<Long, Integrante> {
    fun deleteLogical(id: Long, entity: Integrante): Integrante?
}