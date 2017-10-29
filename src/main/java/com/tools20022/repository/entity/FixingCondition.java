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
import com.tools20022.repository.codeset.BusinessDayConventionCode;
import com.tools20022.repository.codeset.DisruptionFallbackCode;
import com.tools20022.repository.codeset.FinancialCenterCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of parameters used to calculate a rate for instance the fixing rate to be
 * applied to a non-deliverable agreement.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FixingCondition" src="doc-files/FixingCondition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#FixingDateTime
 * FixingCondition.FixingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#NonDeliverableTrade
 * FixingCondition.NonDeliverableTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FixingCondition#FixingRate
 * FixingCondition.FixingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#SettlementRateOption
 * FixingCondition.SettlementRateOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#FinancialCenter
 * FixingCondition.FinancialCenter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#DisruptionFallback
 * FixingCondition.DisruptionFallback}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#BusinessDayConvention
 * FixingCondition.BusinessDayConvention}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#FixingConditions
 * CurrencyExchange.FixingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#FixingConditions
 * NonDeliverableTrade.FixingConditions}</li>
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
 * "FixingCondition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of parameters used to calculate a rate for instance the fixing rate to be applied to a non-deliverable agreement."
 * </li>
 * </ul>
 */
public class FixingCondition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time at which a rate is observed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which a rate is observed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FixingDateTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> FixingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixingDateTime";
			definition = "Date and time at which a rate is observed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Non Deliverable trade for which fixing conditions are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#FixingConditions
	 * NonDeliverableTrade.FixingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDeliverableTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Non Deliverable trade for which fixing conditions are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NonDeliverableTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FixingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonDeliverableTrade";
			definition = "Non Deliverable trade for which fixing conditions are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.FixingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Rate obtained at fixing time by following the fixing conditions (agreed
	 * upon by the trading parties).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#FixingConditions
	 * CurrencyExchange.FixingConditions}</li>
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
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate obtained at fixing time by following the fixing conditions (agreed upon by the trading parties)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FixingRate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FixingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixingRate";
			definition = "Rate obtained at fixing time by following the fixing conditions (agreed upon by the trading parties).";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.FixingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Source used for determining the fixing rate, as provided by various
	 * financial publishing organisations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementRateOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source used for determining the fixing rate, as provided by various financial publishing organisations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementRateOption = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> FixingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementRateOption";
			definition = "Source used for determining the fixing rate, as provided by various financial publishing organisations.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Financial place taken into account to adjust the date and time, as
	 * defined within the business day convention.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCenter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial place taken into account to adjust the date and time, as defined within the business day convention."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialCenter = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> FixingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialCenter";
			definition = "Financial place taken into account to adjust the date and time, as defined within the business day convention.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancialCenterCode.mmObject();
		}
	};
	/**
	 * Method that gives rise to either an alternative basis for determining the
	 * settlement rate, or an alternative basis for settling a transaction when
	 * a disruption event has occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DisruptionFallbackCode
	 * DisruptionFallbackCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisruptionFallback"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method that gives rise to either an alternative basis for determining the settlement rate, or an alternative basis for settling a transaction when a disruption event has occurred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DisruptionFallback = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> FixingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisruptionFallback";
			definition = "Method that gives rise to either an alternative basis for determining the settlement rate, or an alternative basis for settling a transaction when a disruption event has occurred.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DisruptionFallbackCode.mmObject();
		}
	};
	/**
	 * Convention used for adjusting a date when it is not a business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode
	 * BusinessDayConventionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDayConvention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Convention used for adjusting a date when it is not a business day."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BusinessDayConvention = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> FixingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessDayConvention";
			definition = "Convention used for adjusting a date when it is not a business day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BusinessDayConventionCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FixingCondition";
				definition = "Set of parameters used to calculate a rate for instance the fixing rate to be applied to a non-deliverable agreement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.FixingConditions, com.tools20022.repository.entity.NonDeliverableTrade.FixingConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FixingCondition.FixingDateTime, com.tools20022.repository.entity.FixingCondition.NonDeliverableTrade,
						com.tools20022.repository.entity.FixingCondition.FixingRate, com.tools20022.repository.entity.FixingCondition.SettlementRateOption, com.tools20022.repository.entity.FixingCondition.FinancialCenter,
						com.tools20022.repository.entity.FixingCondition.DisruptionFallback, com.tools20022.repository.entity.FixingCondition.BusinessDayConvention);
			}
		});
		return mmObject_lazy.get();
	}
}