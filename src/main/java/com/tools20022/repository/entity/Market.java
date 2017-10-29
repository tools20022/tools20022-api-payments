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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.GeographicalEnvironmentCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Context or geographic environment in which trading parties execute trades.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Market" src="doc-files/Market.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Market#Trade Market.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#Jurisdiction
 * Market.Jurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#Country
 * Market.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Market#GeographicalEnvironment
 * Market.GeographicalEnvironment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#Identification
 * Market.Identification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Market
 * Country.Market}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#IdentifiedMarket
 * PartyIdentificationInformation.IdentifiedMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Market Trade.Market}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Jurisdiction#RelatedMarket
 * Jurisdiction.RelatedMarket}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
 * </li>
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
 * "Market"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Context or geographic environment in which trading parties execute trades."</li>
 * </ul>
 */
public class Market {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade executed in a market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#Market
	 * Trade.Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Market
	 * Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade executed in a market."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Market.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade executed in a market.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Market;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Jurisdiction of the governing law for the trades on this market, for
	 * example, City of NY, County of NY, State of NY, regulatory SEC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RelatedMarket
	 * Jurisdiction.RelatedMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Jurisdiction
	 * Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Market
	 * Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Jurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Jurisdiction of the governing law for the trades on this market, for example, City of NY, County of NY, State of NY, regulatory SEC."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Jurisdiction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Market.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction of the governing law for the trades on this market, for example, City of NY, County of NY, State of NY, regulatory SEC.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.RelatedMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Country in which a market operates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Country#Market
	 * Country.Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Market
	 * Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which a market operates."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Market.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country in which a market operates.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.Market;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Geographic zone in which the cash transfer is executed, from the
	 * perspective of the forwarding or first agent, eg, domestic or
	 * international.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GeographicalEnvironmentCode
	 * GeographicalEnvironmentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Market
	 * Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeographicalEnvironment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Geographic zone in which the cash transfer is executed, from the perspective of the forwarding or first agent, eg, domestic or international."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GeographicalEnvironment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Market.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GeographicalEnvironment";
			definition = "Geographic zone in which the cash transfer is executed, from the perspective of the forwarding or first agent, eg, domestic or international.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> GeographicalEnvironmentCode.mmObject();
		}
	};
	/**
	 * Identifies the market by name, id and/or code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#IdentifiedMarket
	 * PartyIdentificationInformation.IdentifiedMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Market
	 * Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the market by name, id and/or code."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Market.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the market by name, id and/or code.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Market";
				definition = "Context or geographic environment in which trading parties execute trades.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.Market, com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedMarket, com.tools20022.repository.entity.Trade.Market,
						com.tools20022.repository.entity.Jurisdiction.RelatedMarket);
				subType_lazy = () -> Arrays.asList(TradingMarket.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Market.Trade, com.tools20022.repository.entity.Market.Jurisdiction, com.tools20022.repository.entity.Market.Country,
						com.tools20022.repository.entity.Market.GeographicalEnvironment, com.tools20022.repository.entity.Market.Identification);
			}
		});
		return mmObject_lazy.get();
	}
}