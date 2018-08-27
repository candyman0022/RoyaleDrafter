package com.sideproyect.ricardomendez.royaledraft.common

object URLUtils {

    fun cardURL():String {
        return "https://api.clashroyale.com/v1/cards"
    }

    fun playerULR(tag:String):String {
        return "https://api.clashroyale.com/v1/players/%23$tag"
    }
    fun APIToken():String {
        return "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6IjJjM2NlYmIxLWRhM2UtNDJmZi1hY2ZhLTliNjEwYzVjZmUxMiIsImlhdCI6MTUzNDg4Mzk5OCwic3ViIjoiZGV2ZWxvcGVyLzViYTQ2Yzk1LTEwMjQtM2M0YS0xMTI3LWJjZjYyYzZlNjA4YyIsInNjb3BlcyI6WyJyb3lhbGUiXSwibGltaXRzIjpbeyJ0aWVyIjoiZGV2ZWxvcGVyL3NpbHZlciIsInR5cGUiOiJ0aHJvdHRsaW5nIn0seyJjaWRycyI6WyIxODcuMTYzLjE3OS4yMTgiXSwidHlwZSI6ImNsaWVudCJ9XX0.vYGb5NDuGih9LYHoa_bBmChK65NdsM3lwN63ql158OZtHGiM8Wr7lSt-7Z_ogUj-d6vT67_RMkTva-YpxKwTaw"
    }
}