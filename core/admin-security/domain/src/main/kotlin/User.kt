package fr.edjaz.adloveyou.security.domain

data class User(
        var id: Long,
        var individu: Individu,
        var login: String,
        var password: String,
        var profiles: List<Profile>,
        var events: List<UserEventState>
)

interface UserEventState