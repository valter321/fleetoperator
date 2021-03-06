package com.tblxchallenge.fleetoperator.documents

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.PersistenceConstructor
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document(collection = "gpsdata")
data class Trace(
        @Id var id: String? = null,
        val timestamp: Long?,
        val lineId: String?,
        val direction: Int?,
        val journeyPatternId: String?,
        val timeFrame: LocalDate?,
        val vehicleJourneyId: Long?,
        val operator: String?,
        val congestion: Boolean?,
        val longitude: Double?,
        val latitude: Double?,
        val delay: Int?,
        val blockId: Int?,
        val vehicleId: Int?,
        val stopId: String?,
        val atStop: Int?
)