# decisions.md

> Projede verilen bütün mimarisel-teknik kararları ve karar geçmişini içren dokümantasyondur.

---

### - Dependecy Injection Kütüphanesi

- Seçim: **Hilt** 

- Son Güncelleme Tarihi*: 04.06.2026

- Alternatifler: **Koin**

- Sebep: **Sektör standardı olması, Jetpack kütüphaneleriyle tam uyumu ve Google desteği.**


### Navigasyon

- Seçim: **Compose Navigation**


### Mimari Desen (UI Layer)

- Seçim: **MVI (Model-View-Intent)**

- Son Güncelleme Tarihi: 09.06.2026

- Detaylar: **Unidirectional Data Flow (UDF)** prensibiyle State, Intent ve Effect (Side Effect) yapısı kullanılacaktır.
- Sebep: Durum yönetiminin merkezi bir yerden (ViewModel) yapılması, UI'ın tamamen stateless olması ve öngörülebilir veri akışı.
