package example.cashcard;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CashCardService {

    // somente remover comentario quando configurar um banco de dados para o repository se conectar
//    private final CashCardRepository repository;

    public CashCard findById(Long requestedId) {
        CashCard cashCard = new CashCard(99L, 123.45);
        return cashCard;
    }

}
