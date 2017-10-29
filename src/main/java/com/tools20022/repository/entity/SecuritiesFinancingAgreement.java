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
import com.tools20022.repository.codeset.DeliveryTypeCode;
import com.tools20022.repository.codeset.TerminationTypeCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Agreement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contractual details related to the agreement between parties.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesFinancingAgreement"
 * src="doc-files/SecuritiesFinancingAgreement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#SecuritiesFinancingTrade
 * SecuritiesFinancingAgreement.SecuritiesFinancingTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#Currency
 * SecuritiesFinancingAgreement.Currency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#TerminationType
 * SecuritiesFinancingAgreement.TerminationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#DeliveryType
 * SecuritiesFinancingAgreement.DeliveryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#MarginRatio
 * SecuritiesFinancingAgreement.MarginRatio}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#FinancingAgreement
 * SecuritiesFinancing.FinancingAgreement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Agreement
 * Agreement}</li>
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
 * "SecuritiesFinancingAgreement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contractual details related to the agreement between parties."
 * </li>
 * </ul>
 */
public class SecuritiesFinancingAgreement extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies a trade using the related financing agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#FinancingAgreement
	 * SecuritiesFinancing.FinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
	 * SecuritiesFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a trade using the related financing agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesFinancingTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingTrade";
			definition = "Specifies a trade using the related financing agreement.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesFinancing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.FinancingAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contractual currency forming the basis of a financing agreement and
	 * associated transactions. Usually, but not always, the same as the trade
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
	 * SecuritiesFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contractual currency forming the basis of a financing agreement and associated transactions. Usually, but not always, the same as the trade currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Contractual currency forming the basis of a financing agreement and associated transactions. Usually, but not always, the same as the trade currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Type of financing termination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationTypeCode
	 * TerminationTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
	 * SecuritiesFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of financing termination."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TerminationType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationType";
			definition = "Type of financing termination.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TerminationTypeCode.mmObject();
		}
	};
	/**
	 * Identifies type of settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeCode
	 * DeliveryTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
	 * SecuritiesFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies type of settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeliveryType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryType";
			definition = "Identifies type of settlement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DeliveryTypeCode.mmObject();
		}
	};
	/**
	 * Fraction of the cash consideration that must be collateralized, expressed
	 * as a percent. A margin ratio of 02% indicates that the value of the
	 * collateral (after deducting for "haircut") must exceed the cash
	 * consideration by 2%.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
	 * SecuritiesFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fraction of the cash consideration that must be collateralized, expressed as a percent. A margin ratio of 02% indicates that the value of the collateral (after deducting for \"haircut\") must exceed the cash consideration by 2%."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginRatio = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginRatio";
			definition = "Fraction of the cash consideration that must be collateralized, expressed as a percent. A margin ratio of 02% indicates that the value of the collateral (after deducting for \"haircut\") must exceed the cash consideration by 2%.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingAgreement";
				definition = "Contractual details related to the agreement between parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesFinancing.FinancingAgreement);
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesFinancingAgreement.SecuritiesFinancingTrade, com.tools20022.repository.entity.SecuritiesFinancingAgreement.Currency,
						com.tools20022.repository.entity.SecuritiesFinancingAgreement.TerminationType, com.tools20022.repository.entity.SecuritiesFinancingAgreement.DeliveryType,
						com.tools20022.repository.entity.SecuritiesFinancingAgreement.MarginRatio);
			}
		});
		return mmObject_lazy.get();
	}
}