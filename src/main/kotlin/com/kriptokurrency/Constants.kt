package com.kriptokurrency

import com.kriptokurrency.bo.Block
import java.time.Instant

val GENESIS_BLOCK = Block(
        Instant.EPOCH.toEpochMilli(),
        "-----",
        "416752d187aed8855361775f502f89a51a9e6f0c1883e1ab747af15ebff194ff",
        listOf("This is the genesis block"))
