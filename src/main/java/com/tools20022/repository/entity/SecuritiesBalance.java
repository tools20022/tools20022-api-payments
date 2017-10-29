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
import com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code;
import com.tools20022.repository.codeset.ShortLongCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Balance;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Net position of a segregated holding, in a single security, within the
 * overall position held in a securities account. A securities balance is
 * calculated from the sum of securities' receipts minus the sum of securities'
 * deliveries.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesBalance" src="doc-files/SecuritiesBalance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#NetGainLoss
 * SecuritiesBalance.NetGainLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesAccount
 * SecuritiesBalance.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#EligibleBalanceRelatedEntitlement
 * SecuritiesBalance.EligibleBalanceRelatedEntitlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance#ShortLong
 * SecuritiesBalance.ShortLong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AggregateQuantity
 * SecuritiesBalance.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#CorporateActionEntitlement
 * SecuritiesBalance.CorporateActionEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#InstructedBalanceRelatedEntitlement
 * SecuritiesBalance.InstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#UninstructedBalanceRelatedEntitlement
 * SecuritiesBalance.UninstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#MainSecuritiesBalance
 * SecuritiesBalance.MainSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesSubBalance
 * SecuritiesBalance.SecuritiesSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesBalanceType
 * SecuritiesBalance.SecuritiesBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SubBalanceQuantity
 * SecuritiesBalance.SubBalanceQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance#Security
 * SecuritiesBalance.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#ExchangeRate
 * SecuritiesBalance.ExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AvailabilityIndicator
 * SecuritiesBalance.AvailabilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AvailableQuantity
 * SecuritiesBalance.AvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#RelatedMeetingEntitlement
 * SecuritiesBalance.RelatedMeetingEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#UnavailableQuantity
 * SecuritiesBalance.UnavailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SafekeepingPlace
 * SecuritiesBalance.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesEntry
 * SecuritiesBalance.SecuritiesEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#NotEligibleBalanceRelatedEntitlement
 * SecuritiesBalance.NotEligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#RelatedIntraPositionTransfer
 * SecuritiesBalance.RelatedIntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#CostAdjustment
 * SecuritiesBalance.CostAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance#Pledgee
 * SecuritiesBalance.Pledgee}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Balance
 * Security.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SecuritiesBalance
 * SecuritiesAccount.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#AggregateQuantityBalance
 * SecuritiesQuantity.AggregateQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedSubBalance
 * SecuritiesQuantity.RelatedSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#AvailableQuantityBalance
 * SecuritiesQuantity.AvailableQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#UnavailableQuantityBalance
 * SecuritiesQuantity.UnavailableQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#SecuritiesBalance
 * SecuritiesEntry.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SecuritiesBalance
 * SafekeepingPlace.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesBalance
 * CurrencyExchange.CurrencyExchangeForSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#MainSecuritiesBalance
 * SecuritiesBalance.MainSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesSubBalance
 * SecuritiesBalance.SecuritiesSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#EligibleBalance
 * CorporateActionEntitlement.EligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#SecuritiesBalance
 * CorporateActionEntitlement.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#InstructedBalance
 * CorporateActionEntitlement.InstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#UninstructedBalance
 * CorporateActionEntitlement.UninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#NotEligibleBalance
 * CorporateActionEntitlement.NotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#SecuritiesBalance
 * IntraPositionTransfer.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#EligiblePosition
 * MeetingEntitlement.EligiblePosition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Pledgee#SecuritiesBalance
 * Pledgee.SecuritiesBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
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
 * "SecuritiesBalance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account. A securities balance is calculated from the sum of securities' receipts minus the sum of securities' deliveries."
 * </li>
 * </ul>
 */
public class SecuritiesBalance extends Balance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount representing the difference between the cost and the current price
	 * of a security. In the context of securities settlement, it is the amount
	 * paid or received when the instructions are netted or paired off.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetGainLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NetGainLoss = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetGainLoss";
			definition = "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Account or sub-account for which a balance is calculated. It is derived
	 * from the association between Balance and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SecuritiesBalance
	 * SecuritiesAccount.SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account or sub-account for which a balance is calculated. It is derived from the association between Balance and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account or sub-account for which a balance is calculated. It is derived from the association between Balance and Account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action entitlement for which an eligible balance is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#EligibleBalance
	 * CorporateActionEntitlement.EligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleBalanceRelatedEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which an eligible balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EligibleBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an eligible balance is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.EligibleBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indication that the position is short or long.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ShortLongCode
	 * ShortLongCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication that the position is short or long."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ShortLong = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortLong";
			definition = "Indication that the position is short or long.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ShortLongCode.mmObject();
		}
	};
	/**
	 * Total quantity of financial instruments of the balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#AggregateQuantityBalance
	 * SecuritiesQuantity.AggregateQuantityBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of financial instruments of the balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AggregateQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AggregateQuantity";
			definition = "Total quantity of financial instruments of the balance.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.AggregateQuantityBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action entitlement for which a balance is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#SecuritiesBalance
	 * CorporateActionEntitlement.SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which a balance is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEntitlement";
			definition = "Corporate action entitlement for which a balance is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action entitlement for which an instructed balance is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#InstructedBalance
	 * CorporateActionEntitlement.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalanceRelatedEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which an instructed balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InstructedBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructedBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an instructed balance is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.InstructedBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action entitlement for which an uninstructed balance is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#UninstructedBalance
	 * CorporateActionEntitlement.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalanceRelatedEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which an uninstructed balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UninstructedBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UninstructedBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an uninstructed balance is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.UninstructedBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Balance which is divided in sub-balances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesSubBalance
	 * SecuritiesBalance.SecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MainSecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance which is divided in sub-balances."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MainSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MainSecuritiesBalance";
			definition = "Balance which is divided in sub-balances.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SecuritiesSubBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net position of a segregated holding of a single security within the
	 * overall position held in an account, eg, sub-balance per status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#MainSecuritiesBalance
	 * SecuritiesBalance.MainSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSubBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding of a single security within the overall position held in an account, eg, sub-balance per status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesSubBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSubBalance";
			definition = "Net position of a segregated holding of a single security within the overall position held in an account, eg, sub-balance per status.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.MainSecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason a security is not available or additional information about the
	 * financial instrument for which the balance is given, for example,
	 * unregistered, registered in nominee name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason a security is not available or additional information about the financial instrument for which the balance is given, for example, unregistered, registered in nominee name."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecuritiesBalanceType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalanceType";
			definition = "Reason a security is not available or additional information about the financial instrument for which the balance is given, for example, unregistered, registered in nominee name.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
		}
	};
	/**
	 * Net position of a segregated holding of a single security within the
	 * overall position held in a securities account, for instance. sub-balance
	 * per type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedSubBalance
	 * SecuritiesQuantity.RelatedSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding of a single security within the overall position held in a securities account, for instance. sub-balance per type."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SubBalanceQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubBalanceQuantity";
			definition = "Net position of a segregated holding of a single security within the overall position held in a securities account, for instance. sub-balance per type.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedSubBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security for which a balance is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Balance
	 * Security.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a balance is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a balance is calculated.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the exchange rate used to convert the balance value in another
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesBalance
	 * CurrencyExchange.CurrencyExchangeForSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the exchange rate used to convert the balance value in another currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExchangeRate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate used to convert the balance value in another currency.";
			minOccurs = 0;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the quantity of securities on the balance is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailabilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the quantity of securities on the balance is available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AvailabilityIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailabilityIndicator";
			definition = "Indicates whether the quantity of securities on the balance is available.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Total quantity of financial instruments of the balance that is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#AvailableQuantityBalance
	 * SecuritiesQuantity.AvailableQuantityBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instruments of the balance that is available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AvailableQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableQuantity";
			definition = "Total quantity of financial instruments of the balance that is available.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.AvailableQuantityBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entitlement for which an eligible posistion is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#EligiblePosition
	 * MeetingEntitlement.EligiblePosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeetingEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entitlement for which an eligible posistion is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedMeetingEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeetingEntitlement";
			definition = "Entitlement for which an eligible posistion is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MeetingEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.EligiblePosition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total quantity of financial instruments of the balance that is not
	 * available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#UnavailableQuantityBalance
	 * SecuritiesQuantity.UnavailableQuantityBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instruments of the balance that is not available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnavailableQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnavailableQuantity";
			definition = "Total quantity of financial instruments of the balance that is not available.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.UnavailableQuantityBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Safekeeping place at which the securities are held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SecuritiesBalance
	 * SafekeepingPlace.SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Safekeeping place at which the securities are held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Safekeeping place at which the securities are held.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Postings used to calculate a balance. It is derived from the association
	 * between Balance and Entry
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#SecuritiesBalance
	 * SecuritiesEntry.SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesEntry
	 * SecuritiesEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Postings used to calculate a balance. It is derived from the association between Balance and Entry"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntry";
			definition = "Postings used to calculate a balance. It is derived from the association between Balance and Entry";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action entitlement for which a non eligible balance is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#NotEligibleBalance
	 * CorporateActionEntitlement.NotEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEligibleBalanceRelatedEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which a non eligible balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NotEligibleBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotEligibleBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which a non eligible balance is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.NotEligibleBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer between two balances or sub balances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#SecuritiesBalance
	 * IntraPositionTransfer.SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIntraPositionTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer between two balances or sub balances."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedIntraPositionTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedIntraPositionTransfer";
			definition = "Transfer between two balances or sub balances.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> IntraPositionTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the amount added or substracted to the original cost of a
	 * transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CostAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount added or substracted to the original cost of a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CostAdjustment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CostAdjustment";
			definition = "Specifies the amount added or substracted to the original cost of a transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Pledgee at which the securities are held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Pledgee#SecuritiesBalance
	 * Pledgee.SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Pledgee Pledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledgee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pledgee at which the securities are held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Pledgee = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pledgee";
			definition = "Pledgee at which the securities are held.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Pledgee.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Pledgee.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalance";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account. A securities balance is calculated from the sum of securities' receipts minus the sum of securities' deliveries.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Balance, com.tools20022.repository.entity.SecuritiesAccount.SecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesQuantity.AggregateQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.RelatedSubBalance,
						com.tools20022.repository.entity.SecuritiesQuantity.AvailableQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.UnavailableQuantityBalance,
						com.tools20022.repository.entity.SecuritiesEntry.SecuritiesBalance, com.tools20022.repository.entity.SafekeepingPlace.SecuritiesBalance,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesBalance, com.tools20022.repository.entity.SecuritiesBalance.MainSecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesBalance.SecuritiesSubBalance, com.tools20022.repository.entity.CorporateActionEntitlement.EligibleBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.SecuritiesBalance, com.tools20022.repository.entity.CorporateActionEntitlement.InstructedBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.UninstructedBalance, com.tools20022.repository.entity.CorporateActionEntitlement.NotEligibleBalance,
						com.tools20022.repository.entity.IntraPositionTransfer.SecuritiesBalance, com.tools20022.repository.entity.MeetingEntitlement.EligiblePosition, com.tools20022.repository.entity.Pledgee.SecuritiesBalance);
				superType_lazy = () -> Balance.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBalance.NetGainLoss, com.tools20022.repository.entity.SecuritiesBalance.SecuritiesAccount,
						com.tools20022.repository.entity.SecuritiesBalance.EligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.ShortLong,
						com.tools20022.repository.entity.SecuritiesBalance.AggregateQuantity, com.tools20022.repository.entity.SecuritiesBalance.CorporateActionEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.InstructedBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.UninstructedBalanceRelatedEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.MainSecuritiesBalance, com.tools20022.repository.entity.SecuritiesBalance.SecuritiesSubBalance,
						com.tools20022.repository.entity.SecuritiesBalance.SecuritiesBalanceType, com.tools20022.repository.entity.SecuritiesBalance.SubBalanceQuantity, com.tools20022.repository.entity.SecuritiesBalance.Security,
						com.tools20022.repository.entity.SecuritiesBalance.ExchangeRate, com.tools20022.repository.entity.SecuritiesBalance.AvailabilityIndicator, com.tools20022.repository.entity.SecuritiesBalance.AvailableQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.RelatedMeetingEntitlement, com.tools20022.repository.entity.SecuritiesBalance.UnavailableQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.SafekeepingPlace, com.tools20022.repository.entity.SecuritiesBalance.SecuritiesEntry,
						com.tools20022.repository.entity.SecuritiesBalance.NotEligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.RelatedIntraPositionTransfer,
						com.tools20022.repository.entity.SecuritiesBalance.CostAdjustment, com.tools20022.repository.entity.SecuritiesBalance.Pledgee);
			}
		});
		return mmObject_lazy.get();
	}
}