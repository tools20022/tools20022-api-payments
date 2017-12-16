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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.GeographicalEnvironmentCode;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * <li>{@linkplain com.tools20022.repository.entity.Market#mmTrade
 * Market.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#mmJurisdiction
 * Market.mmJurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#mmCountry
 * Market.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Market#mmGeographicalEnvironment
 * Market.mmGeographicalEnvironment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#mmIdentification
 * Market.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmMarket
 * Country.mmMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedMarket
 * PartyIdentificationInformation.mmIdentifiedMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmMarket
 * Trade.mmMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedMarket
 * Jurisdiction.mmRelatedMarket}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected Trade trade;
	/**
	 * Trade executed in a market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#mmMarket
	 * Trade.mmMarket}</li>
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
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade executed in a market.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected Jurisdiction jurisdiction;
	/**
	 * Jurisdiction of the governing law for the trades on this market, for
	 * example, City of NY, County of NY, State of NY, regulatory SEC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedMarket
	 * Jurisdiction.mmRelatedMarket}</li>
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
	public static final MMBusinessAssociationEnd mmJurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction of the governing law for the trades on this market, for example, City of NY, County of NY, State of NY, regulatory SEC.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmRelatedMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};
	protected Country country;
	/**
	 * Country in which a market operates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmMarket
	 * Country.mmMarket}</li>
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
	public static final MMBusinessAssociationEnd mmCountry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country in which a market operates.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected GeographicalEnvironmentCode geographicalEnvironment;
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
	public static final MMBusinessAttribute mmGeographicalEnvironment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GeographicalEnvironment";
			definition = "Geographic zone in which the cash transfer is executed, from the perspective of the forwarding or first agent, eg, domestic or international.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GeographicalEnvironmentCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Market.class.getMethod("getGeographicalEnvironment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentificationInformation identification;
	/**
	 * Identifies the market by name, id and/or code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedMarket
	 * PartyIdentificationInformation.mmIdentifiedMarket}</li>
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
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the market by name, id and/or code.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Market";
				definition = "Context or geographic environment in which trading parties execute trades.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmMarket, com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedMarket,
						com.tools20022.repository.entity.Trade.mmMarket, com.tools20022.repository.entity.Jurisdiction.mmRelatedMarket);
				subType_lazy = () -> Arrays.asList(TradingMarket.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Market.mmTrade, com.tools20022.repository.entity.Market.mmJurisdiction, com.tools20022.repository.entity.Market.mmCountry,
						com.tools20022.repository.entity.Market.mmGeographicalEnvironment, com.tools20022.repository.entity.Market.mmIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Market.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.entity.Trade trade) {
		this.trade = trade;
	}

	public Jurisdiction getJurisdiction() {
		return jurisdiction;
	}

	public void setJurisdiction(com.tools20022.repository.entity.Jurisdiction jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(com.tools20022.repository.entity.Country country) {
		this.country = country;
	}

	public GeographicalEnvironmentCode getGeographicalEnvironment() {
		return geographicalEnvironment;
	}

	public void setGeographicalEnvironment(GeographicalEnvironmentCode geographicalEnvironment) {
		this.geographicalEnvironment = geographicalEnvironment;
	}

	public PartyIdentificationInformation getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.entity.PartyIdentificationInformation identification) {
		this.identification = identification;
	}
}