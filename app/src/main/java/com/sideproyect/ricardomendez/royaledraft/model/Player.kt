package com.sideproyect.ricardomendez.royaledraft.model

data class Player(val tag: String, val name:String, val expLevel:Int, val trophies:Int,
                  val bestTrophies:Int, val wins:Int, val losses:Int, val battleCount:Int,
                  val threeCrownWins:Int, val challengeCardsWon:Int, val challengeMaxWins:Int,
                  val tournamentCardsWon:Int, val tournamentBattleCount:Int, val role:String,
                  val donations:Int, val donationsReceived:Int, val totalDonations:Int,
                  val warDayWins:Int,val clanCardsCollected:Int, val cards:List<Cards>) {
}

