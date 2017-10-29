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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ServiceTaxDesignationCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Product;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Service is the intangible equivalent of a good.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Service" src="doc-files/Service.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Service#Amount
 * Service.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Service#Type Service.Type}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Service#TaxDesignation
 * Service.TaxDesignation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Service#Rate Service.Rate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
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
 * "Service"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Service is the intangible equivalent of a good."</li>
 * </ul>
 */
public class Service extends Product {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount charged for the service.
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
	 * <li>{@linkplain com.tools20022.repository.msg.BillingCompensation1#Value
	 * BillingCompensation1.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount1#HostAmount
	 * BillingServicesAmount1.HostAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount2#HostAmount
	 * BillingServicesAmount2.HostAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount2#SettlementAmount
	 * BillingServicesAmount2.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount3#SourceAmount
	 * BillingServicesAmount3.SourceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount3#HostAmount
	 * BillingServicesAmount3.HostAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#TotalTaxableServiceChargeHostAmount
	 * TaxCalculation1.TotalTaxableServiceChargeHostAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#Amount
	 * BillingServiceAdjustment1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#OriginalChargeAmount
	 * BillingServiceAdjustment1.OriginalChargeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#NewChargeAmount
	 * BillingServiceAdjustment1.NewChargeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#OriginalChargeSettlementAmount
	 * BillingService2.OriginalChargeSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Service
	 * Service}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount charged for the service."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingCompensation1.Value, com.tools20022.repository.msg.BillingServicesAmount1.HostAmount, com.tools20022.repository.msg.BillingServicesAmount2.HostAmount,
					com.tools20022.repository.msg.BillingServicesAmount2.SettlementAmount, com.tools20022.repository.msg.BillingServicesAmount3.SourceAmount, com.tools20022.repository.msg.BillingServicesAmount3.HostAmount,
					com.tools20022.repository.msg.TaxCalculation1.TotalTaxableServiceChargeHostAmount, com.tools20022.repository.msg.BillingServiceAdjustment1.Amount,
					com.tools20022.repository.msg.BillingServiceAdjustment1.OriginalChargeAmount, com.tools20022.repository.msg.BillingServiceAdjustment1.NewChargeAmount,
					com.tools20022.repository.msg.BillingService2.OriginalChargeSettlementAmount);
			elementContext_lazy = () -> Service.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount charged for the service.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Type used to classify and organise different services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#Type
	 * BillingServiceAdjustment1.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Service
	 * Service}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type used to classify and organise different services."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingServiceAdjustment1.Type);
			elementContext_lazy = () -> Service.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type used to classify and organise different services.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies the taxable status of the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignationCode
	 * ServiceTaxDesignationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Service
	 * Service}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDesignation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the taxable status of the service."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TaxDesignation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Service.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDesignation";
			definition = "Identifies the taxable status of the service.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ServiceTaxDesignationCode.mmObject();
		}
	};
	/**
	 * Rate applied on a basis amount to calculate the service charge.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Service
	 * Service}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate applied on a basis amount to calculate the service charge."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Service.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate applied on a basis amount to calculate the service charge.";
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
				name = "Service";
				definition = "Service is the intangible equivalent of a good.";
				superType_lazy = () -> Product.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Service.Amount, com.tools20022.repository.entity.Service.Type, com.tools20022.repository.entity.Service.TaxDesignation,
						com.tools20022.repository.entity.Service.Rate);
			}
		});
		return mmObject_lazy.get();
	}
}