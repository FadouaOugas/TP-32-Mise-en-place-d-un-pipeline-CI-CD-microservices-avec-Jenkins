package com.fadouaougas.fleetmanagement.persistence;

import com.fadouaougas.fleetmanagement.domain.AutomobileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface de repository pour l'accès aux données des véhicules.
 * Fournit les opérations CRUD standard et peut être étendue
 * avec des requêtes personnalisées.
 *
 * <p>Utilise Spring Data JPA pour la génération automatique
 * des implémentations.</p>
 *
 * @author Fadoua Ougas
 * @version 2.0.0
 * @since 2024-12
 * @see AutomobileEntity
 * @see JpaRepository
 */
@Repository
public interface AutomobileDataRepository extends JpaRepository<AutomobileEntity, Long> {

}
