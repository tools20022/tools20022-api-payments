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
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * In securities, a collective investment scheme that has a contractual or a
 * corporate form. When it has a contractual form, a fund is constituted under
 * either the law of contract or under the trust law and thus it is not a legal
 * entity. In its corporate form, a fund is a legal entity and is structured as
 * a company.<br>
 * It has several distinct sub-funds which in effect are traded as individual
 * investment funds.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UmbrellaFund" src="doc-files/UmbrellaFund.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.UmbrellaFund#Name
 * UmbrellaFund.Name}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UmbrellaFund#SubFund
 * UmbrellaFund.SubFund}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#UmbrellaFund
 * InvestmentFund.UmbrellaFund}</li>
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
 * "UmbrellaFund"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "In securities, a collective investment scheme that has a contractual or a corporate form. When it has a contractual form, a fund is constituted under either the law of contract or under the trust law and thus it is not a legal entity. In its corporate form, a fund is a legal entity and is structured as a company.\r\nIt has several distinct sub-funds which in effect are traded as individual investment funds."
 * </li>
 * </ul>
 */
public class UmbrellaFund {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UmbrellaFund UmbrellaFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> UmbrellaFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Compartment of an umbrellla fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#UmbrellaFund
	 * InvestmentFund.UmbrellaFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UmbrellaFund UmbrellaFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Compartment of an umbrellla fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SubFund = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> UmbrellaFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubFund";
			definition = "Compartment of an umbrellla fund.";
			minOccurs = 0;
			type_lazy = () -> InvestmentFund.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.UmbrellaFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UmbrellaFund";
				definition = "In securities, a collective investment scheme that has a contractual or a corporate form. When it has a contractual form, a fund is constituted under either the law of contract or under the trust law and thus it is not a legal entity. In its corporate form, a fund is a legal entity and is structured as a company.\r\nIt has several distinct sub-funds which in effect are traded as individual investment funds.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.UmbrellaFund);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UmbrellaFund.Name, com.tools20022.repository.entity.UmbrellaFund.SubFund);
			}
		});
		return mmObject_lazy.get();
	}
}