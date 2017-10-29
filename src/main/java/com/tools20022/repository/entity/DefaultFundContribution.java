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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
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
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#RelatedMarginCall
 * DefaultFundContribution.RelatedMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#DefaultFund
 * DefaultFundContribution.DefaultFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#ExcessOrDeficitAmount
 * DefaultFundContribution.ExcessOrDeficitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#ContributionAccount
 * DefaultFundContribution.ContributionAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#AmountDirection
 * DefaultFundContribution.AmountDirection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#DefaultFundContribution
 * Account.DefaultFundContribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#DefaultFundContribution
 * MarginCall.DefaultFundContribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DefaultFund#Contribution
 * DefaultFund.Contribution}</li>
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
	/**
	 * Margin call for which a contribution to a default fund is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#DefaultFundContribution
	 * MarginCall.DefaultFundContribution}</li>
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
	public static final MMBusinessAssociationEnd RelatedMarginCall = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DefaultFundContribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMarginCall";
			definition = "Margin call for which a contribution to a default fund is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MarginCall.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.DefaultFundContribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.DefaultFund#Contribution
	 * DefaultFund.Contribution}</li>
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
	public static final MMBusinessAssociationEnd DefaultFund = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DefaultFundContribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFund";
			definition = "Management of the assets posted by participants in a clearing fund that can be used in the event of a default by a participant to compensate non-defaulting participants for losses they suffer due to this default.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFund.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFund.Contribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute ExcessOrDeficitAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DefaultFundContribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExcessOrDeficitAmount";
			definition = "Excess amount that the CCP will restitute to the Clearing member OR deficit to be provided by the member for the guarantee fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Sub account segregated by the central counterparty on the basis of
	 * trading venues/products or other attributes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#DefaultFundContribution
	 * Account.DefaultFundContribution}</li>
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
	public static final MMBusinessAssociationEnd ContributionAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DefaultFundContribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContributionAccount";
			definition = "Sub account segregated by the central counterparty on the basis of trading venues/products or other attributes.";
			minOccurs = 0;
			type_lazy = () -> Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.DefaultFundContribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute AmountDirection = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DefaultFundContribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDirection";
			definition = "Specifies whether the amount is a deficit (debit) or an excess (credit).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DefaultFundContribution";
				definition = "Portion of the participation to the default fund that clearing member must provide. It is the sum of the individual contributions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.DefaultFundContribution, com.tools20022.repository.entity.MarginCall.DefaultFundContribution,
						com.tools20022.repository.entity.DefaultFund.Contribution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DefaultFundContribution.RelatedMarginCall, com.tools20022.repository.entity.DefaultFundContribution.DefaultFund,
						com.tools20022.repository.entity.DefaultFundContribution.ExcessOrDeficitAmount, com.tools20022.repository.entity.DefaultFundContribution.ContributionAccount,
						com.tools20022.repository.entity.DefaultFundContribution.AmountDirection);
			}
		});
		return mmObject_lazy.get();
	}
}