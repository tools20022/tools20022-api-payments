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
 * Role played by a party as source of information.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InformationPartyRole" src="doc-files/InformationPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmGenericIdentification
 * InformationPartyRole.mmGenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmHaircutValuation
 * InformationPartyRole.mmHaircutValuation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmPrice
 * InformationPartyRole.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmScheme
 * InformationPartyRole.mmScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmQuote
 * InformationPartyRole.mmQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmTreasuryTrade
 * InformationPartyRole.mmTreasuryTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmPartyRole
 * GenericIdentification.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmInformationPartyRole
 * SecuritiesPricing.mmInformationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Scheme#mmInformationPartyRole
 * Scheme.mmInformationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#mmInformationPartyRole
 * TreasuryTrade.mmInformationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmPartyRole
 * HaircutValuation.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmPartyRole
 * Quote.mmPartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
 * IdentificationIssuerRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SourceOfPrice SourceOfPrice}
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
 * "InformationPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Role played by a party as source of information."</li>
 * </ul>
 */
public class InformationPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.GenericIdentification> genericIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmPartyRole
	 * GenericIdentification.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the identification for which a party plays the issuer role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InformationPartyRole, List<GenericIdentification>> mmGenericIdentification = new MMBusinessAssociationEnd<InformationPartyRole, List<GenericIdentification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericIdentification";
			definition = "Specifies the identification for which a party plays the issuer role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}

		@Override
		public List<GenericIdentification> getValue(InformationPartyRole obj) {
			return obj.getGenericIdentification();
		}

		@Override
		public void setValue(InformationPartyRole obj, List<GenericIdentification> value) {
			obj.setGenericIdentification(value);
		}
	};
	protected List<com.tools20022.repository.entity.HaircutValuation> haircutValuation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmPartyRole
	 * HaircutValuation.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.HaircutValuation
	 * HaircutValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HaircutValuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the haircut valuation for which a party provides the information."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InformationPartyRole, List<HaircutValuation>> mmHaircutValuation = new MMBusinessAssociationEnd<InformationPartyRole, List<HaircutValuation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HaircutValuation";
			definition = "Specifies the haircut valuation for which a party provides the information.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmObject();
		}

		@Override
		public List<HaircutValuation> getValue(InformationPartyRole obj) {
			return obj.getHaircutValuation();
		}

		@Override
		public void setValue(InformationPartyRole obj, List<HaircutValuation> value) {
			obj.setHaircutValuation(value);
		}
	};
	protected List<SecuritiesPricing> price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmInformationPartyRole
	 * SecuritiesPricing.mmInformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the security price for which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InformationPartyRole, List<SecuritiesPricing>> mmPrice = new MMBusinessAssociationEnd<InformationPartyRole, List<SecuritiesPricing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Specifies the security price for which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesPricing.mmInformationPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public List<SecuritiesPricing> getValue(InformationPartyRole obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(InformationPartyRole obj, List<SecuritiesPricing> value) {
			obj.setPrice(value);
		}
	};
	protected Scheme scheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#mmInformationPartyRole
	 * Scheme.mmInformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Scheme Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme for which the party is the source."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InformationPartyRole, Optional<Scheme>> mmScheme = new MMBusinessAssociationEnd<InformationPartyRole, Optional<Scheme>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Scheme";
			definition = "Scheme for which the party is the source.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.mmInformationPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
		}

		@Override
		public Optional<Scheme> getValue(InformationPartyRole obj) {
			return obj.getScheme();
		}

		@Override
		public void setValue(InformationPartyRole obj, Optional<Scheme> value) {
			obj.setScheme(value.orElse(null));
		}
	};
	protected Quote quote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmPartyRole
	 * Quote.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quoting process in which an information party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InformationPartyRole, Optional<Quote>> mmQuote = new MMBusinessAssociationEnd<InformationPartyRole, Optional<Quote>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quoting process in which an information party plays a role.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}

		@Override
		public Optional<Quote> getValue(InformationPartyRole obj) {
			return obj.getQuote();
		}

		@Override
		public void setValue(InformationPartyRole obj, Optional<Quote> value) {
			obj.setQuote(value.orElse(null));
		}
	};
	protected List<com.tools20022.repository.entity.TreasuryTrade> treasuryTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#mmInformationPartyRole
	 * TreasuryTrade.mmInformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
	 * TreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade for which a quote is provided.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InformationPartyRole, List<TreasuryTrade>> mmTreasuryTrade = new MMBusinessAssociationEnd<InformationPartyRole, List<TreasuryTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TreasuryTrade";
			definition = "Trade for which a quote is provided.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmInformationPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmObject();
		}

		@Override
		public List<TreasuryTrade> getValue(InformationPartyRole obj) {
			return obj.getTreasuryTrade();
		}

		@Override
		public void setValue(InformationPartyRole obj, List<TreasuryTrade> value) {
			obj.setTreasuryTrade(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InformationPartyRole";
				definition = "Role played by a party as source of information.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmPartyRole, SecuritiesPricing.mmInformationPartyRole, com.tools20022.repository.entity.Scheme.mmInformationPartyRole,
						com.tools20022.repository.entity.TreasuryTrade.mmInformationPartyRole, com.tools20022.repository.entity.HaircutValuation.mmPartyRole, com.tools20022.repository.entity.Quote.mmPartyRole);
				subType_lazy = () -> Arrays.asList(IdentificationIssuerRole.mmObject(), SourceOfPrice.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InformationPartyRole.mmGenericIdentification, com.tools20022.repository.entity.InformationPartyRole.mmHaircutValuation,
						com.tools20022.repository.entity.InformationPartyRole.mmPrice, com.tools20022.repository.entity.InformationPartyRole.mmScheme, com.tools20022.repository.entity.InformationPartyRole.mmQuote,
						com.tools20022.repository.entity.InformationPartyRole.mmTreasuryTrade);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InformationPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<GenericIdentification> getGenericIdentification() {
		return genericIdentification == null ? genericIdentification = new ArrayList<>() : genericIdentification;
	}

	public InformationPartyRole setGenericIdentification(List<com.tools20022.repository.entity.GenericIdentification> genericIdentification) {
		this.genericIdentification = Objects.requireNonNull(genericIdentification);
		return this;
	}

	public List<HaircutValuation> getHaircutValuation() {
		return haircutValuation == null ? haircutValuation = new ArrayList<>() : haircutValuation;
	}

	public InformationPartyRole setHaircutValuation(List<com.tools20022.repository.entity.HaircutValuation> haircutValuation) {
		this.haircutValuation = Objects.requireNonNull(haircutValuation);
		return this;
	}

	public List<SecuritiesPricing> getPrice() {
		return price == null ? price = new ArrayList<>() : price;
	}

	public InformationPartyRole setPrice(List<SecuritiesPricing> price) {
		this.price = Objects.requireNonNull(price);
		return this;
	}

	public Optional<Scheme> getScheme() {
		return scheme == null ? Optional.empty() : Optional.of(scheme);
	}

	public InformationPartyRole setScheme(com.tools20022.repository.entity.Scheme scheme) {
		this.scheme = scheme;
		return this;
	}

	public Optional<Quote> getQuote() {
		return quote == null ? Optional.empty() : Optional.of(quote);
	}

	public InformationPartyRole setQuote(com.tools20022.repository.entity.Quote quote) {
		this.quote = quote;
		return this;
	}

	public List<TreasuryTrade> getTreasuryTrade() {
		return treasuryTrade == null ? treasuryTrade = new ArrayList<>() : treasuryTrade;
	}

	public InformationPartyRole setTreasuryTrade(List<com.tools20022.repository.entity.TreasuryTrade> treasuryTrade) {
		this.treasuryTrade = Objects.requireNonNull(treasuryTrade);
		return this;
	}
}