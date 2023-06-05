package routes

import (
	"fmt"
	"log"
	"net/http"
)

func Servidor() {
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		http.ServeFile(w, r, "./index.html")
	})

	http.HandleFunc("/menu", func(w http.ResponseWriter, r *http.Request) {
		http.Redirect(w, r, "/menu.html", http.StatusSeeOther)
	})

	port := ":8081"
	fmt.Printf("\nServidor rodando em http://localhost%s\n", port)
	log.Fatal(http.ListenAndServe(port, nil))
}
