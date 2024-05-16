package mpww.helper.domain.helpboard.model.service;

import mpww.helper.domain.helpboard.model.dto.HelpBoard;
import org.springframework.stereotype.Service;

@Service
public interface HelpBoardService {
    int createHelpBoard(HelpBoard helpBoard);

    int deleteHelpBoard()
}
