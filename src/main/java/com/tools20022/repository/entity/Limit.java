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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.FloorLimitTypeCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.LimitTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CreditLine2;
import com.tools20022.repository.msg.Limit2;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmType Limit.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmAmount
 * Limit.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Limit#mmCreditDebitIndicator
 * Limit.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmUsedAmount
 * Limit.mmUsedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmUsedPercentage
 * Limit.mmUsedPercentage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmCurrency
 * Limit.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmLimitStatus
 * Limit.mmLimitStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmPercentage
 * Limit.mmPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Limit#mmRelatedDebitCreditFacility
 * Limit.mmRelatedDebitCreditFacility}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmPeriodicity
 * Limit.mmPeriodicity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmQuantity
 * Limit.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmValidityPeriod
 * Limit.mmValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmRelatedPaymentCard
 * Limit.mmRelatedPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmAvailableAmount
 * Limit.mmAvailableAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedLimit
 * DateTimePeriod.mmRelatedLimit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmLimit
 * PaymentCard.mmLimit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LimitStatus#mmLimit
 * LimitStatus.mmLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCreditLine
 * DebitCreditFacility.mmCreditLine}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected LimitTypeCode type;
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LimitTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Limit.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount amount;
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
	 * <li>{@linkplain com.tools20022.repository.msg.CreditLine2#mmAmount
	 * CreditLine2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit2#mmAmount
	 * Limit2.mmAmount}</li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CreditLine2.mmAmount, Limit2.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money of the limit, expressed in a currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Limit.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FloorLimitTypeCode creditDebitIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.Limit2#mmCreditDebitIndicator
	 * Limit2.mmCreditDebitIndicator}</li>
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
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Limit2.mmCreditDebitIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if a limit is a debit limit or a credit limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FloorLimitTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Limit.class.getMethod("getCreditDebitIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount usedAmount;
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
	public static final MMBusinessAttribute mmUsedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UsedAmount";
			definition = "Actual usage of the limit expressed as an amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Limit.class.getMethod("getUsedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate usedPercentage;
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
	public static final MMBusinessAttribute mmUsedPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedPercentage";
			definition = "Actual usage of the limit expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Limit.class.getMethod("getUsedPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode currency;
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
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency unit used to specify the limit amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Limit.class.getMethod("getCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.LimitStatus> limitStatus;
	/**
	 * Current status of the limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LimitStatus#mmLimit
	 * LimitStatus.mmLimit}</li>
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
	public static final MMBusinessAssociationEnd mmLimitStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LimitStatus";
			definition = "Current status of the limit.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LimitStatus.mmLimit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LimitStatus.mmObject();
		}
	};
	protected PercentageRate percentage;
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
	public static final MMBusinessAttribute mmPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Specifies that the limit is a percentage of a related amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Limit.class.getMethod("getPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DebitCreditFacility relatedDebitCreditFacility;
	/**
	 * Overdraft conditions for which limit parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCreditLine
	 * DebitCreditFacility.mmCreditLine}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedDebitCreditFacility = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitCreditFacility";
			definition = "Overdraft conditions for which limit parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.mmCreditLine;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.mmObject();
		}
	};
	protected FrequencyCode periodicity;
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
	public static final MMBusinessAttribute mmPeriodicity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Periodicity";
			definition = "Specifies the periodicity linked to a limit for example the periodicity can indicate that the limit can be reached daily or monthly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Limit.class.getMethod("getPeriodicity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber quantity;
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
	public static final MMBusinessAttribute mmQuantity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies that the limit is a quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Limit.class.getMethod("getQuantity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod;
	/**
	 * Period at which the limit is effective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedLimit
	 * DateTimePeriod.mmRelatedLimit}</li>
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
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period at which the limit is effective.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedLimit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected PaymentCard relatedPaymentCard;
	/**
	 * Payment card for which a limit is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmLimit
	 * PaymentCard.mmLimit}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which a limit is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmLimit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
		}
	};
	protected CurrencyAndAmount availableAmount;
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
	public static final MMBusinessAttribute mmAvailableAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableAmount";
			definition = "Remaining amount of money of the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Limit.class.getMethod("getAvailableAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Limit";
				definition = "Value used for risk containment in a system or towards counterparts. The limit may be a current limit or a default limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmRelatedLimit, com.tools20022.repository.entity.PaymentCard.mmLimit, com.tools20022.repository.entity.LimitStatus.mmLimit,
						com.tools20022.repository.entity.DebitCreditFacility.mmCreditLine);
				subType_lazy = () -> Arrays.asList(RiskManagementLimit.mmObject(), Reservation.mmObject(), LiquidityManagementLimit.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Limit.mmType, com.tools20022.repository.entity.Limit.mmAmount, com.tools20022.repository.entity.Limit.mmCreditDebitIndicator,
						com.tools20022.repository.entity.Limit.mmUsedAmount, com.tools20022.repository.entity.Limit.mmUsedPercentage, com.tools20022.repository.entity.Limit.mmCurrency, com.tools20022.repository.entity.Limit.mmLimitStatus,
						com.tools20022.repository.entity.Limit.mmPercentage, com.tools20022.repository.entity.Limit.mmRelatedDebitCreditFacility, com.tools20022.repository.entity.Limit.mmPeriodicity,
						com.tools20022.repository.entity.Limit.mmQuantity, com.tools20022.repository.entity.Limit.mmValidityPeriod, com.tools20022.repository.entity.Limit.mmRelatedPaymentCard,
						com.tools20022.repository.entity.Limit.mmAvailableAmount);
				derivationComponent_lazy = () -> Arrays.asList(CreditLine2.mmObject(), Limit2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Limit.class;
			}
		});
		return mmObject_lazy.get();
	}

	public LimitTypeCode getType() {
		return type;
	}

	public void setType(LimitTypeCode type) {
		this.type = type;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public FloorLimitTypeCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(FloorLimitTypeCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public CurrencyAndAmount getUsedAmount() {
		return usedAmount;
	}

	public void setUsedAmount(CurrencyAndAmount usedAmount) {
		this.usedAmount = usedAmount;
	}

	public PercentageRate getUsedPercentage() {
		return usedPercentage;
	}

	public void setUsedPercentage(PercentageRate usedPercentage) {
		this.usedPercentage = usedPercentage;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public List<LimitStatus> getLimitStatus() {
		return limitStatus;
	}

	public void setLimitStatus(List<com.tools20022.repository.entity.LimitStatus> limitStatus) {
		this.limitStatus = limitStatus;
	}

	public PercentageRate getPercentage() {
		return percentage;
	}

	public void setPercentage(PercentageRate percentage) {
		this.percentage = percentage;
	}

	public DebitCreditFacility getRelatedDebitCreditFacility() {
		return relatedDebitCreditFacility;
	}

	public void setRelatedDebitCreditFacility(com.tools20022.repository.entity.DebitCreditFacility relatedDebitCreditFacility) {
		this.relatedDebitCreditFacility = relatedDebitCreditFacility;
	}

	public FrequencyCode getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(FrequencyCode periodicity) {
		this.periodicity = periodicity;
	}

	public DecimalNumber getQuantity() {
		return quantity;
	}

	public void setQuantity(DecimalNumber quantity) {
		this.quantity = quantity;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public PaymentCard getRelatedPaymentCard() {
		return relatedPaymentCard;
	}

	public void setRelatedPaymentCard(com.tools20022.repository.entity.PaymentCard relatedPaymentCard) {
		this.relatedPaymentCard = relatedPaymentCard;
	}

	public CurrencyAndAmount getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(CurrencyAndAmount availableAmount) {
		this.availableAmount = availableAmount;
	}
}