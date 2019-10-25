package brs.db.store

import brs.db.DerivedTable
import brs.util.logging.safeInfo
import org.slf4j.LoggerFactory
import java.util.concurrent.CopyOnWriteArrayList

class DerivedTableManager {

    private val logger = LoggerFactory.getLogger(DerivedTableManager::class.java)

    val derivedTables = CopyOnWriteArrayList<DerivedTable>()

    fun registerDerivedTable(table: DerivedTable) {
        logger.safeInfo { "Registering derived table ${table.javaClass}" }
        derivedTables.add(table)
    }
}
