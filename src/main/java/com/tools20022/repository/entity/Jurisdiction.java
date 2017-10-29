/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the jurisdiction (country, county, state, province, city).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Jurisdiction" src="doc-files/Jurisdiction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#GovernanceRules
 * Jurisdiction.GovernanceRules}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Jurisdiction#Identification
 * Jurisdiction.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RegisteredSecurities
 * Jurisdiction.RegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#AssociatedStrategy
 * Jurisdiction.AssociatedStrategy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#SecuritiesRestriction
 * Jurisdiction.SecuritiesRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RelatedSecuritiesTax
 * Jurisdiction.RelatedSecuritiesTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Jurisdiction#RelatedMarket
 * Jurisdiction.RelatedMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RelatedAgreement
 * Jurisdiction.RelatedAgreement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#RegistrationJurisdiction
 * Security.RegistrationJurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#RelatedJurisdiction
 * Location.RelatedJurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#Jurisdiction
 * Agreement.Jurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#Jurisdiction
 * SecuritiesTax.Jurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#Jurisdiction
 * SecuritiesRestriction.Jurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GovernanceRules#Jurisdiction
 * GovernanceRules.Jurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.JurisdictionStrategy#Jurisdiction
 * JurisdictionStrategy.Jurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#Jurisdiction
 * Market.Jurisdiction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Jurisdiction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the jurisdiction (country, county, state, province, city)."</li>
 * </ul>
 */
public class Jurisdiction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rules for which an applicable law and a jurisdiction are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GovernanceRules#Jurisdiction
	 * GovernanceRules.Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.GovernanceRules
	 * GovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernanceRules"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rules for which an applicable law and a jurisdiction are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GovernanceRules = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Jurisdiction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GovernanceRules";
			definition = "Rules for which an applicable law and a jurisdiction are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GovernanceRules.Jurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the jurisdiction (country, county, state, province, city).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#RelatedJurisdiction
	 * Location.RelatedJurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the jurisdiction (country, county, state, province, city)."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Jurisdiction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Specifies the jurisdiction (country, county, state, province, city).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.RelatedJurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities which are registered under a specific jurisdiction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#RegistrationJurisdiction
	 * Security.RegistrationJurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities which are registered under a specific jurisdiction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RegisteredSecurities = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Jurisdiction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredSecurities";
			definition = "Securities which are registered under a specific jurisdiction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.RegistrationJurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Strategy which is based on a specific jurisdiction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.JurisdictionStrategy#Jurisdiction
	 * JurisdictionStrategy.Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.JurisdictionStrategy
	 * JurisdictionStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedStrategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy which is based on a specific jurisdiction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssociatedStrategy = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Jurisdiction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssociatedStrategy";
			definition = "Strategy which is based on a specific jurisdiction.";
			minOccurs = 0;
			type_lazy = () -> JurisdictionStrategy.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.JurisdictionStrategy.Jurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities restrictions which apply in a specific jurisdiction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#Jurisdiction
	 * SecuritiesRestriction.Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction
	 * SecuritiesRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRestriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities restrictions which apply in a specific jurisdiction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesRestriction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Jurisdiction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesRestriction";
			definition = "Securities restrictions which apply in a specific jurisdiction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.Jurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities tax for which a jurisdiction is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#Jurisdiction
	 * SecuritiesTax.Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTax
	 * SecuritiesTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities tax for which a jurisdiction is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesTax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Jurisdiction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesTax";
			definition = "Securities tax for which a jurisdiction is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.Jurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market to which the jurisdiction is related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Market#Jurisdiction
	 * Market.Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market to which the jurisdiction is related."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Jurisdiction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMarket";
			definition = "Market to which the jurisdiction is related.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Market.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Market.Jurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Agreement which is subject to a specific jurisdiction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#Jurisdiction
	 * Agreement.Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Agreement Agreement}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement which is subject to a specific jurisdiction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Jurisdiction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAgreement";
			definition = "Agreement which is subject to a specific jurisdiction.";
			minOccurs = 0;
			type_lazy = () -> Agreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.Jurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Jurisdiction";
				definition = "Specifies the jurisdiction (country, county, state, province, city).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.RegistrationJurisdiction, com.tools20022.repository.entity.Location.RelatedJurisdiction,
						com.tools20022.repository.entity.Agreement.Jurisdiction, com.tools20022.repository.entity.SecuritiesTax.Jurisdiction, com.tools20022.repository.entity.SecuritiesRestriction.Jurisdiction,
						com.tools20022.repository.entity.GovernanceRules.Jurisdiction, com.tools20022.repository.entity.JurisdictionStrategy.Jurisdiction, com.tools20022.repository.entity.Market.Jurisdiction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Jurisdiction.GovernanceRules, com.tools20022.repository.entity.Jurisdiction.Identification,
						com.tools20022.repository.entity.Jurisdiction.RegisteredSecurities, com.tools20022.repository.entity.Jurisdiction.AssociatedStrategy, com.tools20022.repository.entity.Jurisdiction.SecuritiesRestriction,
						com.tools20022.repository.entity.Jurisdiction.RelatedSecuritiesTax, com.tools20022.repository.entity.Jurisdiction.RelatedMarket, com.tools20022.repository.entity.Jurisdiction.RelatedAgreement);
			}
		});
		return mmObject_lazy.get();
	}
}