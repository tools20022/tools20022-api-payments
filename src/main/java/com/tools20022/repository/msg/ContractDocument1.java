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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max6Text;
import com.tools20022.repository.entity.AccountContract;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Document that contains the information of the contract agreed between both
 * parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContractDocument1#Reference
 * ContractDocument1.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractDocument1#SignOffDate
 * ContractDocument1.SignOffDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractDocument1#Version
 * ContractDocument1.Version}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountContract
 * AccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02#UnderlyingMasterAgreement
 * AccountExcludedMandateMaintenanceAmendmentRequestV02.
 * UnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#UnderlyingMasterAgreement
 * AccountExcludedMandateMaintenanceRequestV02.UnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#UnderlyingMasterAgreement
 * AccountMandateMaintenanceAmendmentRequestV02.UnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02#UnderlyingMasterAgreement
 * AccountMandateMaintenanceRequestV02.UnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02#UnderlyingMasterAgreement
 * AccountOpeningAdditionalInformationRequestV02.UnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02#UnderlyingMasterAgreement
 * AccountOpeningAmendmentRequestV02.UnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02#UnderlyingMasterAgreement
 * AccountOpeningRequestV02.UnderlyingMasterAgreement}</li>
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
 * "ContractDocument1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Document that contains the information of the contract agreed between both parties."
 * </li>
 * </ul>
 */
public class ContractDocument1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account contract established between the organisation or the group to
	 * which the organisation belongs, and the account servicer. This contract
	 * has to be applied for the new account to be opened and maintained.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#Description
	 * Agreement.Description}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1
	 * ContractDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer. This contract has to be applied for the new account to be opened and maintained."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Reference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContractDocument1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.Description;
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer. This contract has to be applied for the new account to be opened and maintained.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Signoff date of the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#DateSigned
	 * Agreement.DateSigned}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1
	 * ContractDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgnOffDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignOffDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Signoff date of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SignOffDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContractDocument1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.DateSigned;
			isDerived = false;
			xmlTag = "SgnOffDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignOffDate";
			definition = "Signoff date of the document.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Identification of the version of the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#Version
	 * Agreement.Version}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1
	 * ContractDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the version of the contract."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Version = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContractDocument1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.Version;
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Identification of the version of the contract.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractDocument1.Reference, com.tools20022.repository.msg.ContractDocument1.SignOffDate, com.tools20022.repository.msg.ContractDocument1.Version);
				trace_lazy = () -> AccountContract.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02.UnderlyingMasterAgreement,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.UnderlyingMasterAgreement, com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.UnderlyingMasterAgreement,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02.UnderlyingMasterAgreement, com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02.UnderlyingMasterAgreement,
						com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02.UnderlyingMasterAgreement, com.tools20022.repository.area.acmt.AccountOpeningRequestV02.UnderlyingMasterAgreement);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ContractDocument1";
				definition = "Document that contains the information of the contract agreed between both parties.";
			}
		});
		return mmObject_lazy.get();
	}
}