package com.example.rocky.Ayudaaunamascota

class AyudaMascotasProvider {
//xml
    companion object {

        val CentresAdoptionList = listOf<ClaseAyudaMascotas>(
            ClaseAyudaMascotas(

                "CAB",
                "Centro de adopcion CAB Bogota.",
                "Cra. 106a #67-02 · 16477117",
                "data:image/png;base64,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"
            ),

            ClaseAyudaMascotas(
                "MIA",
                "Fundacion de adopcion Mia Bogota D.c",
                "a 9-74 Carrera 14 #92, Chía,",
                "https://img2.koinoscolombia.com/wp-content/uploads/2020/08/LOGO-FUNDAMIA-NEW-mediana.jpg",

                ),

            ClaseAyudaMascotas(
                "Centro cab",
                "Centro de adopcion Bogota D.c",
                "calle ladkaldfakf adsfkjaf",
                "htppdaflkakkafklakfa",

                ),

            ClaseAyudaMascotas(
                "Fundacion huellitas",
                "Centro de adopcion Bogota D.c",
                "calle ladkaldfakf adsfkjaf",
                "htppdaflkakkafklakfa",

                ),

            ClaseAyudaMascotas(
                "Manchas",
                "Centro de adopcion Bogota D.c",
                "calle ladkaldfakf adsfkjaf",
                "htppdaflkakkafklakfa",

                ),
            ClaseAyudaMascotas(
                "Paticas",
                "Centro de adopcion Bogota D.c",
                "calle ladkaldfakf adsfkjaf",
                "htppdaflkakkafklakfa",
            ),

            ClaseAyudaMascotas(
                "Paticas",
                "Centro de adopcion Bogota D.c",
                "calle ladkaldfakf adsfkjaf",
                "htppdaflkakkafklakfa",
            )

        )
    }
}

