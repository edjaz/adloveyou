package fr.edjaz.adloveyou.security.domain

data class Address(
        var street: String,
        var compl: String,
        var zip: String,
        var city: String
)

data class City(
        var cityName: String,
        var country: Country
)

data class Country(
        var countryName: String
)