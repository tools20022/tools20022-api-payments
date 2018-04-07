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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmGovernanceRules
 * Jurisdiction.mmGovernanceRules}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmIdentification
 * Jurisdiction.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRegisteredSecurities
 * Jurisdiction.mmRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmAssociatedStrategy
 * Jurisdiction.mmAssociatedStrategy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmSecuritiesRestriction
 * Jurisdiction.mmSecuritiesRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedSecuritiesTax
 * Jurisdiction.mmRelatedSecuritiesTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedMarket
 * Jurisdiction.mmRelatedMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedAgreement
 * Jurisdiction.mmRelatedAgreement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationJurisdiction
 * Security.mmRegistrationJurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmRelatedJurisdiction
 * Location.mmRelatedJurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmJurisdiction
 * Agreement.mmJurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmJurisdiction
 * SecuritiesTax.mmJurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmJurisdiction
 * SecuritiesRestriction.mmJurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GovernanceRules#mmJurisdiction
 * GovernanceRules.mmJurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.JurisdictionStrategy#mmJurisdiction
 * JurisdictionStrategy.mmJurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#mmJurisdiction
 * Market.mmJurisdiction}</li>
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
	protected GovernanceRules governanceRules;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GovernanceRules#mmJurisdiction
	 * GovernanceRules.mmJurisdiction}</li>
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
	public static final MMBusinessAssociationEnd<Jurisdiction, GovernanceRules> mmGovernanceRules = new MMBusinessAssociationEnd<Jurisdiction, GovernanceRules>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GovernanceRules";
			definition = "Rules for which an applicable law and a jurisdiction are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GovernanceRules.mmJurisdiction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GovernanceRules.mmObject();
		}

		@Override
		public GovernanceRules getValue(Jurisdiction obj) {
			return obj.getGovernanceRules();
		}

		@Override
		public void setValue(Jurisdiction obj, GovernanceRules value) {
			obj.setGovernanceRules(value);
		}
	};
	protected Location identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmRelatedJurisdiction
	 * Location.mmRelatedJurisdiction}</li>
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
	public static final MMBusinessAssociationEnd<Jurisdiction, Location> mmIdentification = new MMBusinessAssociationEnd<Jurisdiction, Location>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Specifies the jurisdiction (country, county, state, province, city).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Location.mmRelatedJurisdiction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}

		@Override
		public Location getValue(Jurisdiction obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Jurisdiction obj, Location value) {
			obj.setIdentification(value);
		}
	};
	protected Security registeredSecurities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationJurisdiction
	 * Security.mmRegistrationJurisdiction}</li>
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
	public static final MMBusinessAssociationEnd<Jurisdiction, Optional<Security>> mmRegisteredSecurities = new MMBusinessAssociationEnd<Jurisdiction, Optional<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredSecurities";
			definition = "Securities which are registered under a specific jurisdiction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Security.mmRegistrationJurisdiction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Optional<Security> getValue(Jurisdiction obj) {
			return obj.getRegisteredSecurities();
		}

		@Override
		public void setValue(Jurisdiction obj, Optional<Security> value) {
			obj.setRegisteredSecurities(value.orElse(null));
		}
	};
	protected List<JurisdictionStrategy> associatedStrategy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.JurisdictionStrategy#mmJurisdiction
	 * JurisdictionStrategy.mmJurisdiction}</li>
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
	public static final MMBusinessAssociationEnd<Jurisdiction, List<JurisdictionStrategy>> mmAssociatedStrategy = new MMBusinessAssociationEnd<Jurisdiction, List<JurisdictionStrategy>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssociatedStrategy";
			definition = "Strategy which is based on a specific jurisdiction.";
			minOccurs = 0;
			opposite_lazy = () -> JurisdictionStrategy.mmJurisdiction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> JurisdictionStrategy.mmObject();
		}

		@Override
		public List<JurisdictionStrategy> getValue(Jurisdiction obj) {
			return obj.getAssociatedStrategy();
		}

		@Override
		public void setValue(Jurisdiction obj, List<JurisdictionStrategy> value) {
			obj.setAssociatedStrategy(value);
		}
	};
	protected SecuritiesRestriction securitiesRestriction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmJurisdiction
	 * SecuritiesRestriction.mmJurisdiction}</li>
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
	public static final MMBusinessAssociationEnd<Jurisdiction, SecuritiesRestriction> mmSecuritiesRestriction = new MMBusinessAssociationEnd<Jurisdiction, SecuritiesRestriction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesRestriction";
			definition = "Securities restrictions which apply in a specific jurisdiction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesRestriction.mmJurisdiction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesRestriction.mmObject();
		}

		@Override
		public SecuritiesRestriction getValue(Jurisdiction obj) {
			return obj.getSecuritiesRestriction();
		}

		@Override
		public void setValue(Jurisdiction obj, SecuritiesRestriction value) {
			obj.setSecuritiesRestriction(value);
		}
	};
	protected SecuritiesTax relatedSecuritiesTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmJurisdiction
	 * SecuritiesTax.mmJurisdiction}</li>
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
	public static final MMBusinessAssociationEnd<Jurisdiction, SecuritiesTax> mmRelatedSecuritiesTax = new MMBusinessAssociationEnd<Jurisdiction, SecuritiesTax>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesTax";
			definition = "Securities tax for which a jurisdiction is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesTax.mmJurisdiction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTax.mmObject();
		}

		@Override
		public SecuritiesTax getValue(Jurisdiction obj) {
			return obj.getRelatedSecuritiesTax();
		}

		@Override
		public void setValue(Jurisdiction obj, SecuritiesTax value) {
			obj.setRelatedSecuritiesTax(value);
		}
	};
	protected Market relatedMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Market#mmJurisdiction
	 * Market.mmJurisdiction}</li>
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
	public static final MMBusinessAssociationEnd<Jurisdiction, Market> mmRelatedMarket = new MMBusinessAssociationEnd<Jurisdiction, Market>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMarket";
			definition = "Market to which the jurisdiction is related.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Market.mmJurisdiction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Market.mmObject();
		}

		@Override
		public Market getValue(Jurisdiction obj) {
			return obj.getRelatedMarket();
		}

		@Override
		public void setValue(Jurisdiction obj, Market value) {
			obj.setRelatedMarket(value);
		}
	};
	protected List<Agreement> relatedAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmJurisdiction
	 * Agreement.mmJurisdiction}</li>
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
	public static final MMBusinessAssociationEnd<Jurisdiction, List<Agreement>> mmRelatedAgreement = new MMBusinessAssociationEnd<Jurisdiction, List<Agreement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAgreement";
			definition = "Agreement which is subject to a specific jurisdiction.";
			minOccurs = 0;
			opposite_lazy = () -> Agreement.mmJurisdiction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Agreement.mmObject();
		}

		@Override
		public List<Agreement> getValue(Jurisdiction obj) {
			return obj.getRelatedAgreement();
		}

		@Override
		public void setValue(Jurisdiction obj, List<Agreement> value) {
			obj.setRelatedAgreement(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Jurisdiction";
				definition = "Specifies the jurisdiction (country, county, state, province, city).";
				associationDomain_lazy = () -> Arrays.asList(Security.mmRegistrationJurisdiction, Location.mmRelatedJurisdiction, Agreement.mmJurisdiction, SecuritiesTax.mmJurisdiction, SecuritiesRestriction.mmJurisdiction,
						GovernanceRules.mmJurisdiction, JurisdictionStrategy.mmJurisdiction, Market.mmJurisdiction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Jurisdiction.mmGovernanceRules, com.tools20022.repository.entity.Jurisdiction.mmIdentification,
						com.tools20022.repository.entity.Jurisdiction.mmRegisteredSecurities, com.tools20022.repository.entity.Jurisdiction.mmAssociatedStrategy, com.tools20022.repository.entity.Jurisdiction.mmSecuritiesRestriction,
						com.tools20022.repository.entity.Jurisdiction.mmRelatedSecuritiesTax, com.tools20022.repository.entity.Jurisdiction.mmRelatedMarket, com.tools20022.repository.entity.Jurisdiction.mmRelatedAgreement);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Jurisdiction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GovernanceRules getGovernanceRules() {
		return governanceRules;
	}

	public Jurisdiction setGovernanceRules(GovernanceRules governanceRules) {
		this.governanceRules = Objects.requireNonNull(governanceRules);
		return this;
	}

	public Location getIdentification() {
		return identification;
	}

	public Jurisdiction setIdentification(Location identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Security> getRegisteredSecurities() {
		return registeredSecurities == null ? Optional.empty() : Optional.of(registeredSecurities);
	}

	public Jurisdiction setRegisteredSecurities(Security registeredSecurities) {
		this.registeredSecurities = registeredSecurities;
		return this;
	}

	public List<JurisdictionStrategy> getAssociatedStrategy() {
		return associatedStrategy == null ? associatedStrategy = new ArrayList<>() : associatedStrategy;
	}

	public Jurisdiction setAssociatedStrategy(List<JurisdictionStrategy> associatedStrategy) {
		this.associatedStrategy = Objects.requireNonNull(associatedStrategy);
		return this;
	}

	public SecuritiesRestriction getSecuritiesRestriction() {
		return securitiesRestriction;
	}

	public Jurisdiction setSecuritiesRestriction(SecuritiesRestriction securitiesRestriction) {
		this.securitiesRestriction = Objects.requireNonNull(securitiesRestriction);
		return this;
	}

	public SecuritiesTax getRelatedSecuritiesTax() {
		return relatedSecuritiesTax;
	}

	public Jurisdiction setRelatedSecuritiesTax(SecuritiesTax relatedSecuritiesTax) {
		this.relatedSecuritiesTax = Objects.requireNonNull(relatedSecuritiesTax);
		return this;
	}

	public Market getRelatedMarket() {
		return relatedMarket;
	}

	public Jurisdiction setRelatedMarket(Market relatedMarket) {
		this.relatedMarket = Objects.requireNonNull(relatedMarket);
		return this;
	}

	public List<Agreement> getRelatedAgreement() {
		return relatedAgreement == null ? relatedAgreement = new ArrayList<>() : relatedAgreement;
	}

	public Jurisdiction setRelatedAgreement(List<Agreement> relatedAgreement) {
		this.relatedAgreement = Objects.requireNonNull(relatedAgreement);
		return this;
	}
}