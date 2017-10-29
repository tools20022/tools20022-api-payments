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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Separate account containing illiquid assets of a hedge fund portfolio. Only
 * the present participants in the hedge fund will be entitled to a share of it.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SidePocket" src="doc-files/SidePocket.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SidePocket#SidePocketInclusionIndicator
 * SidePocket.SidePocketInclusionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SidePocket#SidePocketIdentification
 * SidePocket.SidePocketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SidePocket#InvestmentAccount
 * SidePocket.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SidePocket#SidePocketQuantity
 * SidePocket.SidePocketQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#SidePocket
 * InvestmentAccount.SidePocket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SidePocket
 * SecuritiesQuantity.SidePocket}</li>
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
 * "SidePocket"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Separate account containing illiquid assets of a hedge fund portfolio. Only the present participants in the hedge fund will be entitled to a share of it."
 * </li>
 * </ul>
 */
public class SidePocket {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the investor wants to participate in the optional side
	 * pocket.
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
	 * {@linkplain com.tools20022.repository.entity.SidePocket SidePocket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketInclusionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor wants to participate in the optional side pocket."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SidePocketInclusionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SidePocket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SidePocketInclusionIndicator";
			definition = "Indicates whether the investor wants to participate in the optional side pocket.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies the side pocket.<br>
	 * Type of account used in hedge funds to separate illiquid assets from
	 * other more liquid investments. <br>
	 * Once an asset is designated for inclusion in a side pocket, new investors
	 * do not share in it, and when existing investors redeem from the hedge
	 * fund, they remain as investors in the side pocket until it is liquidated.
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
	 * {@linkplain com.tools20022.repository.entity.SidePocket SidePocket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the side pocket.\r\nType of account used in hedge funds to separate illiquid assets from other more liquid investments. \r\nOnce an asset is designated for inclusion in a side pocket, new investors do not share in it, and when existing investors redeem from the hedge fund, they remain as investors in the side pocket until it is liquidated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SidePocketIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SidePocket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SidePocketIdentification";
			definition = "Identifies the side pocket.\r\nType of account used in hedge funds to separate illiquid assets from other more liquid investments. \r\nOnce an asset is designated for inclusion in a side pocket, new investors do not share in it, and when existing investors redeem from the hedge fund, they remain as investors in the side pocket until it is liquidated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Investment account which contains the liquid assets of a hedge fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#SidePocket
	 * InvestmentAccount.SidePocket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SidePocket SidePocket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account which contains the liquid assets of a hedge fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SidePocket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Investment account which contains the liquid assets of a hedge fund.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.SidePocket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of the side pocket.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SidePocket
	 * SecuritiesQuantity.SidePocket}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SidePocket SidePocket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of the side pocket."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SidePocketQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SidePocket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SidePocketQuantity";
			definition = "Quantity of the side pocket.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SidePocket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SidePocket";
				definition = "Separate account containing illiquid assets of a hedge fund portfolio. Only the present participants in the hedge fund will be entitled to a share of it.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.SidePocket, com.tools20022.repository.entity.SecuritiesQuantity.SidePocket);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SidePocket.SidePocketInclusionIndicator, com.tools20022.repository.entity.SidePocket.SidePocketIdentification,
						com.tools20022.repository.entity.SidePocket.InvestmentAccount, com.tools20022.repository.entity.SidePocket.SidePocketQuantity);
			}
		});
		return mmObject_lazy.get();
	}
}