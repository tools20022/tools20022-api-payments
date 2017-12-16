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
import com.tools20022.repository.codeset.AllegementStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of an allegement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AllegementStatusCode#Cancelled
 * AllegementStatusCode.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AllegementStatusCode#Removed
 * AllegementStatusCode.mmRemoved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AllegementStatusCode#Pending
 * AllegementStatusCode.mmPending}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CANC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AllegementStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of an allegement."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AllegementStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Allegement has been cancelled since the previous delta statement. The
	 * allegement was cancelled because of a mistake by the sender or because
	 * the alleging party cancelled its instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AllegementStatusCode
	 * AllegementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allegement has been cancelled since the previous delta statement. The allegement was cancelled because of a mistake by the sender or because the alleging party cancelled its instruction."
	 * </li>
	 * </ul>
	 */
	public static final AllegementStatusCode Cancelled = new AllegementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Allegement has been cancelled since the previous delta statement. The allegement was cancelled because of a mistake by the sender or because the alleging party cancelled its instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.AllegementStatusCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Allegement has been removed since the previous delta statement. The
	 * allegement was removed because the alleged party sent its instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AllegementStatusCode
	 * AllegementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Removed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allegement has been removed since the previous delta statement. The allegement was removed because the alleged party sent its instruction."
	 * </li>
	 * </ul>
	 */
	public static final AllegementStatusCode Removed = new AllegementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Removed";
			definition = "Allegement has been removed since the previous delta statement. The allegement was removed because the alleged party sent its instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.AllegementStatusCode.mmObject();
			codeName = "REMO";
		}
	};
	/**
	 * Allegement is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AllegementStatusCode
	 * AllegementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allegement is pending."</li>
	 * </ul>
	 */
	public static final AllegementStatusCode Pending = new AllegementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Allegement is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.AllegementStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	final static private LinkedHashMap<String, AllegementStatusCode> codesByName = new LinkedHashMap<>();

	protected AllegementStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CANC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AllegementStatusCode";
				definition = "Specifies the status of an allegement.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AllegementStatusCode.Cancelled, com.tools20022.repository.codeset.AllegementStatusCode.Removed,
						com.tools20022.repository.codeset.AllegementStatusCode.Pending);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(Removed.getCodeName().get(), Removed);
		codesByName.put(Pending.getCodeName().get(), Pending);
	}

	public static AllegementStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AllegementStatusCode[] values() {
		AllegementStatusCode[] values = new AllegementStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AllegementStatusCode> {
		@Override
		public AllegementStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AllegementStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}