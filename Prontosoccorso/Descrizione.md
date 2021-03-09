# Descrizione del funzionamento del "Pronto Soccorso":

- il progetto vuole rappresentare il tabellone delle registrazioni di ogni paziente arrivato al prontosoccorso.

## Funzionamento:
- si inseriscono i dati: 
  - nome
  - cognome
  - codice fiscale
- attraverso un *ComboBox*, l'operatore inserisce i sintomi presentati dal paziente.
  - alcuni esempi: asma, ustioni, piccole lesioni, allergie ..
  - Ogni sintomo è associato al codice colore, quest'ultimo è in relazione alla gravità e può essere:
    - bianco = prestazione non urgente
    - verde = urgenza minore
    - giallo = urgenza
    - rosso = emergenza
- è presente il bottone "aggiungi" che permette di aggiungere e visualizzare i dati di un paziente su una ListView.

### Inoltre:
- nel caso in cui non venissero riempiti tutti i campi di inserimento relativi ai dati del paziente, nel momento il cui l'operatore preme il bottone "aggiungi":
  - si apre una "Warning Dialog" che avvisa l'operatore che non sono stati riempiti tutti i campi di testo.


#### progetto didattico.
