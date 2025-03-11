document.addEventListener("DOMContentLoaded", function() {
    // Sélectionner tous les boutons "Supprimer"
    const deleteButtons = document.querySelectorAll('.delete-btn');

    deleteButtons.forEach(button => {
        button.addEventListener('click', function(event) {
            event.preventDefault(); // Empêche le comportement par défaut (le lien qui se déclenche)

            const studentId = this.getAttribute('data-id'); // Récupère l'ID de l'étudiant

            // Confirmation avant de supprimer
            const confirmation = confirm("Êtes-vous sûr de vouloir supprimer cet étudiant ?");
            if (confirmation) {
                // Si confirmé, redirige vers l'URL de suppression
                window.location.href = `/delete/${studentId}`;
            }
        });
    });
});
