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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementLatestVersion;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * The AccountRequestAcknowledgement message is sent from a financial
 * institution to an organisation. This message is sent in response to a request
 * message from the organisation. It is sent after the request has been
 * validated from an authentication and authorization point of view. The
 * business content has not yet been validated at this stage.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#mmReferences
 * AccountRequestAcknowledgementV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#mmFrom
 * AccountRequestAcknowledgementV02.mmFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#mmAccountIdentification
 * AccountRequestAcknowledgementV02.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#mmOrganisationIdentification
 * AccountRequestAcknowledgementV02.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#mmAccountServicerIdentification
 * AccountRequestAcknowledgementV02.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#mmDigitalSignature
 * AccountRequestAcknowledgementV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#mmSupplementaryData
 * AccountRequestAcknowledgementV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctReqAck"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
 * AccountManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.010.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountRequestAcknowledgementV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AccountRequestAcknowledgement message is sent from a financial institution to an organisation. This message is sent in response to a request message from the organisation. It is sent after the request has been validated from an authentication and authorization point of view. The business content has not yet been validated at this stage."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountRequestAcknowledgementV02", propOrder = {"references", "from", "accountIdentification", "organisationIdentification", "accountServicerIdentification", "digitalSignature", "supplementaryData"})
public class AccountRequestAcknowledgementV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected References5 references;
	/**
	 * Set of elements for the identification of the message and related
	 * references.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.References5
	 * References5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements for the identification of the message and related references."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReferences = new MMMessageBuildingBlock() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Set of elements for the identification of the message and related references.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> References5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountRequestAcknowledgementV02.class.getMethod("getReferences", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrganisationIdentification8 from;
	/**
	 * Identifies the business sender of the message, if it is not the account
	 * owner or account servicing financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "From"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the business sender of the message, if it is not the account owner or account servicing financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFrom = new MMMessageBuildingBlock() {
		{
			xmlTag = "Fr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "From";
			definition = "Identifies the business sender of the message, if it is not the account owner or account servicing financial institution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OrganisationIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountRequestAcknowledgementV02.class.getMethod("getFrom", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<AccountForAction1> accountIdentification;
	/**
	 * Unique and unambiguous identification of the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountForAction1
	 * AccountForAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification of the account between the account owner and the account servicer.";
			minOccurs = 0;
			complexType_lazy = () -> AccountForAction1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountRequestAcknowledgementV02.class.getMethod("getAccountIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrganisationIdentification8 organisationIdentification;
	/**
	 * Identifier for an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for an organisation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOrganisationIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationIdentification";
			definition = "Identifier for an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OrganisationIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountRequestAcknowledgementV02.class.getMethod("getOrganisationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BranchAndFinancialInstitutionIdentification5 accountServicerIdentification;
	/**
	 * Unique and unambiguous identifier of a financial institution, as assigned
	 * under an internationally recognised or proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme. \n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountServicerIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctSvcrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIdentification";
			definition = "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme. \n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountRequestAcknowledgementV02.class.getMethod("getAccountServicerIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PartyAndSignature2> digitalSignature;
	/**
	 * Contains the signature with its components, namely signed info, signature
	 * value, key info and the object.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the signature with its components, namely signed info, signature value, key info and the object."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDigitalSignature = new MMMessageBuildingBlock() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Contains the signature with its components, namely signed info, signature value, key info and the object.";
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountRequestAcknowledgementV02.class.getMethod("getDigitalSignature", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountRequestAcknowledgementV02.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountRequestAcknowledgementV02";
				definition = "The AccountRequestAcknowledgement message is sent from a financial institution to an organisation. This message is sent in response to a request message from the organisation. It is sent after the request has been validated from an authentication and authorization point of view. The business content has not yet been validated at this stage.";
				rootElement = "Document";
				xmlTag = "AcctReqAck";
				businessArea_lazy = () -> AccountManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.mmReferences, com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.mmFrom,
						com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.mmAccountIdentification, com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.mmOrganisationIdentification,
						com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.mmAccountServicerIdentification, com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.mmDigitalSignature,
						com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "010";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountRequestAcknowledgementV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Refs", required = true)
	public References5 getReferences() {
		return references;
	}

	public void setReferences(References5 references) {
		this.references = references;
	}

	@XmlElement(name = "Fr")
	public OrganisationIdentification8 getFrom() {
		return from;
	}

	public void setFrom(OrganisationIdentification8 from) {
		this.from = from;
	}

	@XmlElement(name = "AcctId")
	public List<AccountForAction1> getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(List<AccountForAction1> accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	@XmlElement(name = "OrgId", required = true)
	public OrganisationIdentification8 getOrganisationIdentification() {
		return organisationIdentification;
	}

	public void setOrganisationIdentification(OrganisationIdentification8 organisationIdentification) {
		this.organisationIdentification = organisationIdentification;
	}

	@XmlElement(name = "AcctSvcrId", required = true)
	public BranchAndFinancialInstitutionIdentification5 getAccountServicerIdentification() {
		return accountServicerIdentification;
	}

	public void setAccountServicerIdentification(BranchAndFinancialInstitutionIdentification5 accountServicerIdentification) {
		this.accountServicerIdentification = accountServicerIdentification;
	}

	@XmlElement(name = "DgtlSgntr")
	public List<PartyAndSignature2> getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(List<PartyAndSignature2> digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.010.02.02")
	static public class Document {
		@XmlElement(name = "AcctReqAck", required = true)
		public AccountRequestAcknowledgementV02 messageBody;
	}
}