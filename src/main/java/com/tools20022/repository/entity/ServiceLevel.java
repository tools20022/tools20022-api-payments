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
import com.tools20022.repository.choice.ServiceLevel8Choice;
import com.tools20022.repository.codeset.ServiceLevelCode;
import com.tools20022.repository.codeset.SWIFTServiceLevelCode;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agreement under which or rules under which the transaction should be
 * processed.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ServiceLevel" src="doc-files/ServiceLevel.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ServiceLevel#PaymentProcessing
 * ServiceLevel.PaymentProcessing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ServiceLevel#Code
 * ServiceLevel.Code}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ServiceLevel#Other
 * ServiceLevel.Other}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ServiceLevel#Bilateral
 * ServiceLevel.Bilateral}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#ServiceLevel
 * PaymentProcessing.ServiceLevel}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ServiceLevel8Choice#Proprietary
 * ServiceLevel8Choice.Proprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ServiceLevel8Choice
 * ServiceLevel8Choice}</li>
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
 * "ServiceLevel"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement under which or rules under which the transaction should be processed."
 * </li>
 * </ul>
 */
public class ServiceLevel {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment process for which a service level is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#ServiceLevel
	 * PaymentProcessing.ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment process for which a service level is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentProcessing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ServiceLevel.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentProcessing";
			definition = "Payment process for which a service level is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.ServiceLevel;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of a pre-agreed level of service between the parties in a
	 * coded form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceLevelCode
	 * ServiceLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ServiceLevel8Choice#Code
	 * ServiceLevel8Choice.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a pre-agreed level of service between the parties in a coded form."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ServiceLevel8Choice.Code);
			elementContext_lazy = () -> ServiceLevel.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Identification of a pre-agreed level of service between the parties in a coded form.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ServiceLevelCode.mmObject();
		}
	};
	/**
	 * SWIFT defined service level applies to the payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevelCode
	 * SWIFTServiceLevelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SWIFT defined service level applies to the payment instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Other = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ServiceLevel.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "SWIFT defined service level applies to the payment instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SWIFTServiceLevelCode.mmObject();
		}
	};
	/**
	 * Unambiguous identification of a pre-agreed level of service between the
	 * parties.
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
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of a pre-agreed level of service between the parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Bilateral = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ServiceLevel.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bilateral";
			definition = "Unambiguous identification of a pre-agreed level of service between the parties.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ServiceLevel";
				definition = "Agreement under which or rules under which the transaction should be processed.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentProcessing.ServiceLevel);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ServiceLevel8Choice.Proprietary);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ServiceLevel.PaymentProcessing, com.tools20022.repository.entity.ServiceLevel.Code, com.tools20022.repository.entity.ServiceLevel.Other,
						com.tools20022.repository.entity.ServiceLevel.Bilateral);
				derivationComponent_lazy = () -> Arrays.asList(ServiceLevel8Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}