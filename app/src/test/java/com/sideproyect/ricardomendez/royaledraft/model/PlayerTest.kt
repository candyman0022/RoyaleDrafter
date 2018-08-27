package com.sideproyect.ricardomendez.royaledraft.model

import com.sideproyect.ricardomendez.royaledraft.common.URLUtils
import org.junit.Assert.*
import org.junit.Test

class PlayerTest {

    private val CANDYMAN = "2V8QGRRL"
    private val JHOAN = "2G02CUY9G"
    private val TEPOX = "QYYVLQRQ"
    private val TOKEN = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6IjJjM2NlYmIxLWRhM2UtNDJmZi1hY2ZhLTliNjEwYzVjZmUxMiIsImlhdCI6MTUzNDg4Mzk5OCwic3ViIjoiZGV2ZWxvcGVyLzViYTQ2Yzk1LTEwMjQtM2M0YS0xMTI3LWJjZjYyYzZlNjA4YyIsInNjb3BlcyI6WyJyb3lhbGUiXSwibGltaXRzIjpbeyJ0aWVyIjoiZGV2ZWxvcGVyL3NpbHZlciIsInR5cGUiOiJ0aHJvdHRsaW5nIn0seyJjaWRycyI6WyIxODcuMTYzLjE3OS4yMTgiXSwidHlwZSI6ImNsaWVudCJ9XX0.vYGb5NDuGih9LYHoa_bBmChK65NdsM3lwN63ql158OZtHGiM8Wr7lSt-7Z_ogUj-d6vT67_RMkTva-YpxKwTaw"

    @Test
    fun playerTest() {

    }

    @Test
    fun urlUtilsCardTest() {
        assertEquals("https://api.clashroyale.com/v1/cards",URLUtils.cardURL())
    }

    @Test
    fun urlUtilsPlayerTest() {
        assertEquals("https://api.clashroyale.com/v1/players/%232V8QGRRL",URLUtils.playerULR(CANDYMAN))
    }

    @Test
    fun urlUtilsTokenTest() {
        assertEquals(TOKEN,URLUtils.APIToken())
    }
}