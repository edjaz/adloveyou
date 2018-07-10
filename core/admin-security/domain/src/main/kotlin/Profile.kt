package fr.edjaz.adloveyou.security.domain

data class Profile(
        var name: String,
        var roles: List<Role>,
        var description: String
)

data class Role(
        var name: String,
        var permissions: List<Permission>,
        var description: String
)

data class Permission(
        var name: String,
        var description: String
)