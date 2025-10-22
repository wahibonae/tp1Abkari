package ma.emsi.abkari.tp1abkari.llm;

/**
 * Record pour représenter une interaction avec le LLM.
 * Le record contient la requête JSON, la réponse JSON du LLM, et le texte de la réponse LLM.
 */
public record LlmInteraction (
    String questionJson,
    String reponseJson,
    String reponseExtraite
) {}
