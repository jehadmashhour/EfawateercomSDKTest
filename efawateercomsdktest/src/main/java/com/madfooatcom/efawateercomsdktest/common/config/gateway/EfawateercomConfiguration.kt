package com.madfooatcom.efawateercomsdktest.common.config.gateway


import com.madfooatcom.efawateercomsdktest.EfEnvironment


class EfawateercomConfiguration private constructor(
    var environment: EfEnvironment,
    val language: String,
    val theme: String,
) {


    data class Builder(private val environment: EfEnvironment) {

        private var language: String = EfLanguage.ENGLISH.isoCode
        private var theme: String = EfTheme.LIGHT.themeName

        fun language(language: String) = apply { this.language = language }
        fun language(languageEnum: EfLanguage) = apply { this.language = languageEnum.isoCode }
        fun theme(theme: String) = apply { this.theme = theme }
        fun theme(themeEnum: EfTheme) = apply { this.theme = themeEnum.themeName }
        fun build() = EfawateercomConfiguration(environment, language, theme)
    }
}