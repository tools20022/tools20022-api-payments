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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.FloorLimitTypeCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.LimitTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.CreditLine2;
import com.tools20022.repository.msg.Limit2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Value used for risk containment in a system or towards counterparts. The
 * limit may be a current limit or a default limit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Limit" src="doc-files/Limit.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#Type Limit.Type}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#Amount Limit.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#CreditDebitIndicator
 * Limit.CreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#UsedAmount
 * Limit.UsedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#UsedPercentage
 * Limit.UsedPercentage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#Currency
 * Limit.Currency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#LimitStatus
 * Limit.LimitStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#Percentage
 * Limit.Percentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Limit#RelatedDebitCreditFacility
 * Limit.RelatedDebitCreditFacility}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#Periodicity
 * Limit.Periodicity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#Quantity
 * Limit.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#ValidityPeriod
 * Limit.ValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#RelatedPaymentCard
 * Limit.RelatedPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#AvailableAmount
 * Limit.AvailableAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedLimit
 * DateTimePeriod.RelatedLimit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Limit
 * PaymentCard.Limit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LimitStatus#Limit
 * LimitStatus.Limit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#CreditLine
 * DebitCreditFacility.CreditLine}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.RiskManagementLimit
 * RiskManagementLimit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
 * LiquidityManagementLimit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CreditLine2 CreditLine2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit2 Limit2}</li>
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
 * "Limit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Value used for risk containment in a system or towards counterparts. The limit may be a current limit or a default limit."
 * </li>
 * </ul>
 */
public class Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Nature of the limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the limit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the limit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LimitTypeCode.mmObject();
		}
	};
	/**
	 * Amount of money of the limit, expressed in a currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditLine2#Amount
	 * CreditLine2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit2#Amount
	 * Limit2.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money of the limit, expressed in a currency."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditLine2.Amount, com.tools20022.repository.msg.Limit2.Amount);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money of the limit, expressed in a currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies if a limit is a debit limit or a credit limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FloorLimitTypeCode
	 * FloorLimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit2#CreditDebitIndicator
	 * Limit2.CreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies if a limit is a debit limit or a credit limit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Limit2.CreditDebitIndicator);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if a limit is a debit limit or a credit limit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FloorLimitTypeCode.mmObject();
		}
	};
	/**
	 * Actual usage of the limit expressed as an amount.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual usage of the limit expressed as an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UsedAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UsedAmount";
			definition = "Actual usage of the limit expressed as an amount.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Actual usage of the limit expressed as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual usage of the limit expressed as a percentage."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UsedPercentage = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedPercentage";
			definition = "Actual usage of the limit expressed as a percentage.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Currency unit used to specify the limit amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency unit used to specify the limit amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency unit used to specify the limit amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Current status of the limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LimitStatus#Limit
	 * LimitStatus.Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LimitStatus
	 * LimitStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current status of the limit."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LimitStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitStatus";
			definition = "Current status of the limit.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.LimitStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LimitStatus.Limit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies that the limit is a percentage of a related amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the limit is a percentage of a related amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Percentage = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Specifies that the limit is a percentage of a related amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Overdraft conditions for which limit parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#CreditLine
	 * DebitCreditFacility.CreditLine}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DebitCreditFacility
	 * DebitCreditFacility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitCreditFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Overdraft conditions for which limit parameters are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedDebitCreditFacility = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitCreditFacility";
			definition = "Overdraft conditions for which limit parameters are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DebitCreditFacility.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.CreditLine;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the periodicity linked to a limit for example the periodicity
	 * can indicate that the limit can be reached daily or monthly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Periodicity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the periodicity linked to a limit for example the periodicity can indicate that the limit can be reached daily or monthly."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Periodicity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Periodicity";
			definition = "Specifies the periodicity linked to a limit for example the periodicity can indicate that the limit can be reached daily or monthly.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Specifies that the limit is a quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that the limit is a quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Quantity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies that the limit is a quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Period at which the limit is effective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedLimit
	 * DateTimePeriod.RelatedLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period at which the limit is effective."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period at which the limit is effective.";
			minOccurs = 0;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedLimit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment card for which a limit is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#Limit
	 * PaymentCard.Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card for which a limit is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which a limit is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentCard.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.Limit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Remaining amount of money of the limit.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Remaining amount of money of the limit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AvailableAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableAmount";
			definition = "Remaining amount of money of the limit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Limit";
				definition = "Value used for risk containment in a system or towards counterparts. The limit may be a current limit or a default limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedLimit, com.tools20022.repository.entity.PaymentCard.Limit, com.tools20022.repository.entity.LimitStatus.Limit,
						com.tools20022.repository.entity.DebitCreditFacility.CreditLine);
				subType_lazy = () -> Arrays.asList(RiskManagementLimit.mmObject(), Reservation.mmObject(), LiquidityManagementLimit.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Limit.Type, com.tools20022.repository.entity.Limit.Amount, com.tools20022.repository.entity.Limit.CreditDebitIndicator,
						com.tools20022.repository.entity.Limit.UsedAmount, com.tools20022.repository.entity.Limit.UsedPercentage, com.tools20022.repository.entity.Limit.Currency, com.tools20022.repository.entity.Limit.LimitStatus,
						com.tools20022.repository.entity.Limit.Percentage, com.tools20022.repository.entity.Limit.RelatedDebitCreditFacility, com.tools20022.repository.entity.Limit.Periodicity,
						com.tools20022.repository.entity.Limit.Quantity, com.tools20022.repository.entity.Limit.ValidityPeriod, com.tools20022.repository.entity.Limit.RelatedPaymentCard,
						com.tools20022.repository.entity.Limit.AvailableAmount);
				derivationComponent_lazy = () -> Arrays.asList(CreditLine2.mmObject(), Limit2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}