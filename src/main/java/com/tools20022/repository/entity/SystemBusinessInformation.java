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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Details about business information related to a system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemBusinessInformation"
 * src="doc-files/SystemBusinessInformation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmQualifier
 * SystemBusinessInformation.mmQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmSubject
 * SystemBusinessInformation.mmSubject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmSubjectDetails
 * SystemBusinessInformation.mmSubjectDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmIdentification
 * SystemBusinessInformation.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmReference
 * SystemBusinessInformation.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmSystem
 * SystemBusinessInformation.mmSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#mmSystemGeneratedInformation
 * System.mmSystemGeneratedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationQualifier#mmSystemBusinessInformation
 * InformationQualifier.mmSystemBusinessInformation}</li>
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
 * "SystemBusinessInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details about business information related to a system."</li>
 * </ul>
 */
public class SystemBusinessInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected InformationQualifier qualifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationQualifier#mmSystemBusinessInformation
	 * InformationQualifier.mmSystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationQualifier
	 * InformationQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Qualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information about the criticality or importance of a general business information system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQualifier = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Qualifier";
			definition = "Further information about the criticality or importance of a general business information system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationQualifier.mmSystemBusinessInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InformationQualifier.mmObject();
		}
	};
	protected Max35Text subject;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subject line of an item of general business information, summarizing the topic and intended destination of the information."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSubject = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Subject";
			definition = "Subject line of an item of general business information, summarizing the topic and intended destination of the information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SystemBusinessInformation.class.getMethod("getSubject", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text subjectDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General business information, in unstructured form."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSubjectDetails = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubjectDetails";
			definition = "General business information, in unstructured form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SystemBusinessInformation.class.getMethod("getSubjectDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a general business information system, as assigned by the system transaction administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a general business information system, as assigned by the system transaction administrator.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SystemBusinessInformation.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous reference assigned to a general business information system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reference";
			definition = "Unique and unambiguous reference assigned to a general business information system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SystemBusinessInformation.class.getMethod("getReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected System system;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmSystemGeneratedInformation
	 * System.mmSystemGeneratedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which business information is generated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which business information is generated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmSystemGeneratedInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemBusinessInformation";
				definition = "Details about business information related to a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.mmSystemGeneratedInformation, com.tools20022.repository.entity.InformationQualifier.mmSystemBusinessInformation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemBusinessInformation.mmQualifier, com.tools20022.repository.entity.SystemBusinessInformation.mmSubject,
						com.tools20022.repository.entity.SystemBusinessInformation.mmSubjectDetails, com.tools20022.repository.entity.SystemBusinessInformation.mmIdentification,
						com.tools20022.repository.entity.SystemBusinessInformation.mmReference, com.tools20022.repository.entity.SystemBusinessInformation.mmSystem);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SystemBusinessInformation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public InformationQualifier getQualifier() {
		return qualifier;
	}

	public SystemBusinessInformation setQualifier(com.tools20022.repository.entity.InformationQualifier qualifier) {
		this.qualifier = Objects.requireNonNull(qualifier);
		return this;
	}

	public Max35Text getSubject() {
		return subject;
	}

	public SystemBusinessInformation setSubject(Max35Text subject) {
		this.subject = Objects.requireNonNull(subject);
		return this;
	}

	public Max350Text getSubjectDetails() {
		return subjectDetails;
	}

	public SystemBusinessInformation setSubjectDetails(Max350Text subjectDetails) {
		this.subjectDetails = Objects.requireNonNull(subjectDetails);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public SystemBusinessInformation setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Max35Text getReference() {
		return reference;
	}

	public SystemBusinessInformation setReference(Max35Text reference) {
		this.reference = Objects.requireNonNull(reference);
		return this;
	}

	public Optional<System> getSystem() {
		return system == null ? Optional.empty() : Optional.of(system);
	}

	public SystemBusinessInformation setSystem(com.tools20022.repository.entity.System system) {
		this.system = system;
		return this;
	}
}