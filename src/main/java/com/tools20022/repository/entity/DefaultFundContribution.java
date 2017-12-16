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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	 * Margin call for which a contribution to a default fund is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedMarginCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMarginCall";
			definition = "Margin call for which a contribution to a default fund is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.mmDefaultFundContribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DefaultFund> defaultFund;
	/**
	 * Management of the assets posted by participants in a clearing fund that
	 * can be used in the event of a default by a participant to compensate
	 * non-defaulting participants for losses they suffer due to this default.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmDefaultFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFund";
			definition = "Management of the assets posted by participants in a clearing fund that can be used in the event of a default by a participant to compensate non-defaulting participants for losses they suffer due to this default.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFund.mmContribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFund.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount excessOrDeficitAmount;
	/**
	 * Excess amount that the CCP will restitute to the Clearing member OR
	 * deficit to be provided by the member for the guarantee fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
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
	 * name} = "ExcessOrDeficitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Excess amount that the CCP will restitute to the Clearing member OR deficit to be provided by the member for the guarantee fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExcessOrDeficitAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExcessOrDeficitAmount";
			definition = "Excess amount that the CCP will restitute to the Clearing member OR deficit to be provided by the member for the guarantee fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DefaultFundContribution.class.getMethod("getExcessOrDeficitAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Account> contributionAccount;
	/**
	 * Sub account segregated by the central counterparty on the basis of
	 * trading venues/products or other attributes.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmContributionAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContributionAccount";
			definition = "Sub account segregated by the central counterparty on the basis of trading venues/products or other attributes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmDefaultFundContribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected DebitCreditCode amountDirection;
	/**
	 * Specifies whether the amount is a deficit (debit) or an excess (credit).
	 * <p>
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the amount is a deficit (debit) or an excess (credit)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmountDirection = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDirection";
			definition = "Specifies whether the amount is a deficit (debit) or an excess (credit).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DefaultFundContribution.class.getMethod("getAmountDirection", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DefaultFundContribution";
				definition = "Portion of the participation to the default fund that clearing member must provide. It is the sum of the individual contributions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmDefaultFundContribution, com.tools20022.repository.entity.MarginCall.mmDefaultFundContribution,
						com.tools20022.repository.entity.DefaultFund.mmContribution);
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

	public MarginCall getRelatedMarginCall() {
		return relatedMarginCall;
	}

	public void setRelatedMarginCall(com.tools20022.repository.entity.MarginCall relatedMarginCall) {
		this.relatedMarginCall = relatedMarginCall;
	}

	public List<DefaultFund> getDefaultFund() {
		return defaultFund;
	}

	public void setDefaultFund(List<com.tools20022.repository.entity.DefaultFund> defaultFund) {
		this.defaultFund = defaultFund;
	}

	public ActiveCurrencyAndAmount getExcessOrDeficitAmount() {
		return excessOrDeficitAmount;
	}

	public void setExcessOrDeficitAmount(ActiveCurrencyAndAmount excessOrDeficitAmount) {
		this.excessOrDeficitAmount = excessOrDeficitAmount;
	}

	public List<Account> getContributionAccount() {
		return contributionAccount;
	}

	public void setContributionAccount(List<com.tools20022.repository.entity.Account> contributionAccount) {
		this.contributionAccount = contributionAccount;
	}

	public DebitCreditCode getAmountDirection() {
		return amountDirection;
	}

	public void setAmountDirection(DebitCreditCode amountDirection) {
		this.amountDirection = amountDirection;
	}
}