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
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.Jurisdiction;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
	protected Trade trade;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Market, Trade> mmTrade = new MMBusinessAssociationEnd<Market, Trade>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade executed in a market.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Trade.mmMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Trade.mmObject();
		}

		@Override
		public Trade getValue(Market obj) {
			return obj.getTrade();
		}

		@Override
		public void setValue(Market obj, Trade value) {
			obj.setTrade(value);
		}
	};
	protected Jurisdiction jurisdiction;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Market, Jurisdiction> mmJurisdiction = new MMBusinessAssociationEnd<Market, Jurisdiction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction of the governing law for the trades on this market, for example, City of NY, County of NY, State of NY, regulatory SEC.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Jurisdiction.mmRelatedMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Jurisdiction.mmObject();
		}

		@Override
		public Jurisdiction getValue(Market obj) {
			return obj.getJurisdiction();
		}

		@Override
		public void setValue(Market obj, Jurisdiction value) {
			obj.setJurisdiction(value);
		}
	};
	protected Country country;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Market, Country> mmCountry = new MMBusinessAssociationEnd<Market, Country>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country in which a market operates.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Country.mmMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Country.mmObject();
		}

		@Override
		public Country getValue(Market obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(Market obj, Country value) {
			obj.setCountry(value);
		}
	};
	protected GeographicalEnvironmentCode geographicalEnvironment;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Market, GeographicalEnvironmentCode> mmGeographicalEnvironment = new MMBusinessAttribute<Market, GeographicalEnvironmentCode>() {
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

		@Override
		public GeographicalEnvironmentCode getValue(Market obj) {
			return obj.getGeographicalEnvironment();
		}

		@Override
		public void setValue(Market obj, GeographicalEnvironmentCode value) {
			obj.setGeographicalEnvironment(value);
		}
	};
	protected PartyIdentificationInformation identification;
	/**
	 * 
	 <p>
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the market by name, id and/or code."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Market, PartyIdentificationInformation> mmIdentification = new MMBusinessAssociationEnd<Market, PartyIdentificationInformation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the market by name, id and/or code.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PartyIdentificationInformation.mmIdentifiedMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}

		@Override
		public PartyIdentificationInformation getValue(Market obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Market obj, PartyIdentificationInformation value) {
			obj.setIdentification(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Market";
				definition = "Context or geographic environment in which trading parties execute trades.";
				associationDomain_lazy = () -> Arrays.asList(Country.mmMarket, PartyIdentificationInformation.mmIdentifiedMarket, Trade.mmMarket, Jurisdiction.mmRelatedMarket);
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

	public Market setTrade(Trade trade) {
		this.trade = Objects.requireNonNull(trade);
		return this;
	}

	public Jurisdiction getJurisdiction() {
		return jurisdiction;
	}

	public Market setJurisdiction(Jurisdiction jurisdiction) {
		this.jurisdiction = Objects.requireNonNull(jurisdiction);
		return this;
	}

	public Country getCountry() {
		return country;
	}

	public Market setCountry(Country country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public GeographicalEnvironmentCode getGeographicalEnvironment() {
		return geographicalEnvironment;
	}

	public Market setGeographicalEnvironment(GeographicalEnvironmentCode geographicalEnvironment) {
		this.geographicalEnvironment = Objects.requireNonNull(geographicalEnvironment);
		return this;
	}

	public PartyIdentificationInformation getIdentification() {
		return identification;
	}

	public Market setIdentification(PartyIdentificationInformation identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}
}