@Entity
@Table(name = "instrutor")
public class Instrutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInstrutor;
    // ... outros atributos

    @OneToMany(mappedBy = "instrutor")
    private List<Turma> turmas;
}

@Entity
@Table(name = "turma")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTurma;
    // ... outros atributos

    @ManyToOne
    @JoinColumn(name = "idInstrutor")
    private Instrutor instrutor;
}
