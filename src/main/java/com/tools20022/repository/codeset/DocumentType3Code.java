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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DocumentType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a type of financial or commercial document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code#RemittanceAdviceMessage
 * DocumentType3Code.mmRemittanceAdviceMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code#RelatedPaymentInstruction
 * DocumentType3Code.mmRelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code#ForeignExchangeDealReference
 * DocumentType3Code.mmForeignExchangeDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code#DispatchAdvice
 * DocumentType3Code.mmDispatchAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code#PurchaseOrder
 * DocumentType3Code.mmPurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code#StructuredCommunicationReference
 * DocumentType3Code.mmStructuredCommunicationReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
 * DocumentTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RADM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DocumentType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of financial or commercial document."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DocumentType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceAdviceMessage"</li>
	 * </ul>
	 */
	public static final DocumentType3Code RemittanceAdviceMessage = new DocumentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceAdviceMessage";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType3Code.mmObject();
			codeName = DocumentTypeCode.RemittanceAdviceMessage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentInstruction"</li>
	 * </ul>
	 */
	public static final DocumentType3Code RelatedPaymentInstruction = new DocumentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPaymentInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType3Code.mmObject();
			codeName = DocumentTypeCode.RelatedPaymentInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDealReference"</li>
	 * </ul>
	 */
	public static final DocumentType3Code ForeignExchangeDealReference = new DocumentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDealReference";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType3Code.mmObject();
			codeName = DocumentTypeCode.ForeignExchangeDealReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DispatchAdvice"</li>
	 * </ul>
	 */
	public static final DocumentType3Code DispatchAdvice = new DocumentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DispatchAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType3Code.mmObject();
			codeName = DocumentTypeCode.DispatchAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrder"</li>
	 * </ul>
	 */
	public static final DocumentType3Code PurchaseOrder = new DocumentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType3Code.mmObject();
			codeName = DocumentTypeCode.PurchaseOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType3Code
	 * DocumentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StructuredCommunicationReference"</li>
	 * </ul>
	 */
	public static final DocumentType3Code StructuredCommunicationReference = new DocumentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredCommunicationReference";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType3Code.mmObject();
			codeName = DocumentTypeCode.StructuredCommunicationReference.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DocumentType3Code> codesByName = new LinkedHashMap<>();

	protected DocumentType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("RADM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentType3Code";
				definition = "Specifies a type of financial or commercial document.";
				trace_lazy = () -> DocumentTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DocumentType3Code.RemittanceAdviceMessage, com.tools20022.repository.codeset.DocumentType3Code.RelatedPaymentInstruction,
						com.tools20022.repository.codeset.DocumentType3Code.ForeignExchangeDealReference, com.tools20022.repository.codeset.DocumentType3Code.DispatchAdvice,
						com.tools20022.repository.codeset.DocumentType3Code.PurchaseOrder, com.tools20022.repository.codeset.DocumentType3Code.StructuredCommunicationReference);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RemittanceAdviceMessage.getCodeName().get(), RemittanceAdviceMessage);
		codesByName.put(RelatedPaymentInstruction.getCodeName().get(), RelatedPaymentInstruction);
		codesByName.put(ForeignExchangeDealReference.getCodeName().get(), ForeignExchangeDealReference);
		codesByName.put(DispatchAdvice.getCodeName().get(), DispatchAdvice);
		codesByName.put(PurchaseOrder.getCodeName().get(), PurchaseOrder);
		codesByName.put(StructuredCommunicationReference.getCodeName().get(), StructuredCommunicationReference);
	}

	public static DocumentType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DocumentType3Code[] values() {
		DocumentType3Code[] values = new DocumentType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DocumentType3Code> {
		@Override
		public DocumentType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DocumentType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}