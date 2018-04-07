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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.DefaultFund;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Portion of the participation to the default fund that clearing member must
 * provide. It is the sum of the individual contributions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DefaultFundContribution"
 * src="doc-files/DefaultFundContribution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmRelatedMarginCall
 * DefaultFundContribution.mmRelatedMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmDefaultFund
 * DefaultFundContribution.mmDefaultFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmExcessOrDeficitAmount
 * DefaultFundContribution.mmExcessOrDeficitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmContributionAccount
 * DefaultFundContribution.mmContributionAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmAmountDirection
 * DefaultFundContribution.mmAmountDirection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundContribution
 * Account.mmDefaultFundContribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmDefaultFundContribution
 * MarginCall.mmDefaultFundContribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DefaultFund#mmContribution
 * DefaultFund.mmContribution}</li>
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
 * "DefaultFundContribution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Portion of the participation to the default fund that clearing member must provide. It is the sum of the individual contributions."
 * </li>
 * </ul>
 */
public class DefaultFundContribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected MarginCall relatedMarginCall;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmDefaultFundContribution
	 * MarginCall.mmDefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarginCall
	 * MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution
	 * DefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMarginCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin call for which a contribution to a default fund is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<DefaultFundContribution, Optional<MarginCall>> mmRelatedMarginCall = new MMBusinessAssociationEnd<DefaultFundContribution, Optional<MarginCall>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMarginCall";
			definition = "Margin call for which a contribution to a default fund is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> MarginCall.mmDefaultFundContribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MarginCall.mmObject();
		}

		@Override
		public Optional<MarginCall> getValue(DefaultFundContribution obj) {
			return obj.getRelatedMarginCall();
		}

		@Override
		public void setValue(DefaultFundContribution obj, Optional<MarginCall> value) {
			obj.setRelatedMarginCall(value.orElse(null));
		}
	};
	protected List<DefaultFund> defaultFund;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFund#mmContribution
	 * DefaultFund.mmContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DefaultFund
	 * DefaultFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution
	 * DefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Management of the assets posted by participants in a clearing fund that can be used in the event of a default by a participant to compensate non-defaulting participants for losses they suffer due to this default."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<DefaultFundContribution, List<DefaultFund>> mmDefaultFund = new MMBusinessAssociationEnd<DefaultFundContribution, List<DefaultFund>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFund";
			definition = "Management of the assets posted by participants in a clearing fund that can be used in the event of a default by a participant to compensate non-defaulting participants for losses they suffer due to this default.";
			minOccurs = 0;
			opposite_lazy = () -> DefaultFund.mmContribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DefaultFund.mmObject();
		}

		@Override
		public List<DefaultFund> getValue(DefaultFundContribution obj) {
			return obj.getDefaultFund();
		}

		@Override
		public void setValue(DefaultFundContribution obj, List<DefaultFund> value) {
			obj.setDefaultFund(value);
		}
	};
	protected CurrencyAndAmount excessOrDeficitAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution
	 * DefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExcessOrDeficitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Excess amount that the CCP will restitute to the Clearing member OR deficit to be provided by the member for the guarantee fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<DefaultFundContribution, CurrencyAndAmount> mmExcessOrDeficitAmount = new MMBusinessAttribute<DefaultFundContribution, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExcessOrDeficitAmount";
			definition = "Excess amount that the CCP will restitute to the Clearing member OR deficit to be provided by the member for the guarantee fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(DefaultFundContribution obj) {
			return obj.getExcessOrDeficitAmount();
		}

		@Override
		public void setValue(DefaultFundContribution obj, CurrencyAndAmount value) {
			obj.setExcessOrDeficitAmount(value);
		}
	};
	protected List<Account> contributionAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundContribution
	 * Account.mmDefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution
	 * DefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContributionAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub account segregated by the central counterparty on the basis of trading venues/products or other attributes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<DefaultFundContribution, List<Account>> mmContributionAccount = new MMBusinessAssociationEnd<DefaultFundContribution, List<Account>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContributionAccount";
			definition = "Sub account segregated by the central counterparty on the basis of trading venues/products or other attributes.";
			minOccurs = 0;
			opposite_lazy = () -> Account.mmDefaultFundContribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public List<Account> getValue(DefaultFundContribution obj) {
			return obj.getContributionAccount();
		}

		@Override
		public void setValue(DefaultFundContribution obj, List<Account> value) {
			obj.setContributionAccount(value);
		}
	};
	protected DebitCreditCode amountDirection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution
	 * DefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the amount is a deficit (debit) or an excess (credit)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<DefaultFundContribution, DebitCreditCode> mmAmountDirection = new MMBusinessAttribute<DefaultFundContribution, DebitCreditCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountDirection";
			definition = "Specifies whether the amount is a deficit (debit) or an excess (credit).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		@Override
		public DebitCreditCode getValue(DefaultFundContribution obj) {
			return obj.getAmountDirection();
		}

		@Override
		public void setValue(DefaultFundContribution obj, DebitCreditCode value) {
			obj.setAmountDirection(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DefaultFundContribution";
				definition = "Portion of the participation to the default fund that clearing member must provide. It is the sum of the individual contributions.";
				associationDomain_lazy = () -> Arrays.asList(Account.mmDefaultFundContribution, MarginCall.mmDefaultFundContribution, DefaultFund.mmContribution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DefaultFundContribution.mmRelatedMarginCall, com.tools20022.repository.entity.DefaultFundContribution.mmDefaultFund,
						com.tools20022.repository.entity.DefaultFundContribution.mmExcessOrDeficitAmount, com.tools20022.repository.entity.DefaultFundContribution.mmContributionAccount,
						com.tools20022.repository.entity.DefaultFundContribution.mmAmountDirection);
			}

			@Override
			public Class<?> getInstanceClass() {
				return DefaultFundContribution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MarginCall> getRelatedMarginCall() {
		return relatedMarginCall == null ? Optional.empty() : Optional.of(relatedMarginCall);
	}

	public DefaultFundContribution setRelatedMarginCall(MarginCall relatedMarginCall) {
		this.relatedMarginCall = relatedMarginCall;
		return this;
	}

	public List<DefaultFund> getDefaultFund() {
		return defaultFund == null ? defaultFund = new ArrayList<>() : defaultFund;
	}

	public DefaultFundContribution setDefaultFund(List<DefaultFund> defaultFund) {
		this.defaultFund = Objects.requireNonNull(defaultFund);
		return this;
	}

	public CurrencyAndAmount getExcessOrDeficitAmount() {
		return excessOrDeficitAmount;
	}

	public DefaultFundContribution setExcessOrDeficitAmount(CurrencyAndAmount excessOrDeficitAmount) {
		this.excessOrDeficitAmount = Objects.requireNonNull(excessOrDeficitAmount);
		return this;
	}

	public List<Account> getContributionAccount() {
		return contributionAccount == null ? contributionAccount = new ArrayList<>() : contributionAccount;
	}

	public DefaultFundContribution setContributionAccount(List<Account> contributionAccount) {
		this.contributionAccount = Objects.requireNonNull(contributionAccount);
		return this;
	}

	public DebitCreditCode getAmountDirection() {
		return amountDirection;
	}

	public DefaultFundContribution setAmountDirection(DebitCreditCode amountDirection) {
		this.amountDirection = Objects.requireNonNull(amountDirection);
		return this;
	}
}