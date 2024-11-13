```mermaid
classDiagram
    class Iphone{
        +deslizar()void
        +clicar()void
    }

    class Ipod {
        -musica : String
        +tocarMusica(musica: String)void
        +visualizarAlbum()void
    }
    
    class Telefone {
        - contato : String
        +ligar(contato: String)void
    }

    class SMS {
        +digitar()void
        +enviarMensagem()void
    }

    class Fotos {
        +virarTela()void
        +zoom()void
    }

    class Safari {
        +pesquisar()void
        +virarTela()void
        +digitar()void
    }

    class YahooMail {
        +mandarEmail()void
    }

    class Widgets {
        +mostrarAcoes()void
        +mostrarPrevisaoDoTempo()void
    }

    class GoogleMaps {
        +marcarPonto()void
        +pesquisar()void
        +digitar()void
        +ligar(contato: String)void
        +zoom()void
    }

    Iphone <|-- Ipod
    Iphone <|-- Telefone
    Iphone <|-- SMS
    Iphone <|-- Fotos
    Iphone <|-- Safari
    Iphone <|-- YahooMail
    Iphone <|-- Widgets
    Iphone <|-- GoogleMaps
    ```
