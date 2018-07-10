package fr.edjaz.adloveyou.security.domain

data class Individu(
        var id: Long,
        var firstname: String,
        var lastname: String,
        var address: Address,
        var meanOfContacts: List<TypeMeanOfContact>
)

enum class TypeMeanOfContact {
    PHONE, MOBILE, EMAIL, FAX
}

data class MeanOfContact(
        var value: String,
        var type: TypeMeanOfContact
)